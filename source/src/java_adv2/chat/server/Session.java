package java_adv2.chat.server;

import java_adv2.chat.command.Command;
import java_adv2.chat.command.NullCommand;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import static java_adv1.util.MyLogger.log;
import static java_adv2.network.tcp.SocketCloseUtil.closeAll;

public class Session implements Runnable {
    private final Socket socket;
    private final DataInputStream input;
    final DataOutputStream output;
    private final SessionManager sessionManager;
    private boolean closed = false;
    private String name;

    public String getName() {
        return name;
    }

    public Session(Socket socket, SessionManager sessionManager) throws IOException {
        this.socket = socket;
        this.input = new DataInputStream(socket.getInputStream());
        this.output = new DataOutputStream(socket.getOutputStream());
        this.sessionManager = sessionManager;
        this.sessionManager.add(this);
    }

    public void close() {
        if (closed) {
            return;
        }
        closeAll(socket, input, output);
        closed = true;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String received = input.readUTF();
                sessionManager.execute(received, this);
            }
        } catch (IOException e) {
            log(e);
        } finally {
            sessionManager.remove(this);
            close();
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}
