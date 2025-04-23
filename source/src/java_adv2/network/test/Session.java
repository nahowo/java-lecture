package java_adv2.network.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static java_adv1.util.MyLogger.log;
import static java_adv2.network.tcp.SocketCloseUtil.closeAll;

public class Session implements Runnable{
    private final Socket socket;
    private final DataInputStream input;
    private final DataOutputStream output;
    private final SessionManager sessionManager;
    private String name;
    private boolean closed = false;

    public Session(Socket socket, SessionManager sessionManager) throws IOException {
        this.socket = socket;
        this.input = new DataInputStream(socket.getInputStream());
        this.output = new DataOutputStream(socket.getOutputStream());
        this.sessionManager = sessionManager;
        this.sessionManager.add(this);
    }

    @Override
    public void run() {

        try {
            while (true) {
                String received = input.readUTF();
                String[] tmp = received.split("\\|");
                String cmd = tmp[0];
                if (cmd.equals("/join")) {
                    this.name = tmp[1];
                    sessionManager.send(tmp[1] + "님이 입장했습니다. ");
                } else if (cmd.equals("/message")) {
                    sessionManager.send(this.name + " | " + tmp[1]);
                } else if (cmd.equals("/change")) {
                    this.name = tmp[1];
                } else if (cmd.equals("/users")) {
                    sessionManager.printAll(this);
                } else if (cmd.equals("/exit")) {
                    sessionManager.closeAll();
                    break;
                }
            }
        }catch (IOException e) {
            log(e);
        } finally {
            sessionManager.remove(this);
            close();
        }
    }

    public synchronized void close() {
        if (closed) {
            return;
        }
        closeAll(socket, input, output);
        closed = true;
    }

    public synchronized void send(String message) throws IOException {
        output.writeUTF(message);
    }

    public synchronized String getName() {
        return name;
    }
}
