package java_adv2.network.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static java_adv1.util.MyLogger.log;
import static java_adv2.network.tcp.SocketCloseUtil.closeAll;

public class Session {
    private final Socket socket;
    private final DataInputStream input;
    private final DataOutputStream output;
    public final ReadHandler readHandler;
    public final WriterHandler writerHandler;
    public final SessionManager sessionManager;

    private boolean closed = false;
    private String name;

    public Session(Socket socket, SessionManager sessionManager) throws IOException {
        this.socket = socket;
        this.input = new DataInputStream(socket.getInputStream());
        this.output = new DataOutputStream(socket.getOutputStream());
        this.readHandler = new ReadHandler(input, this); // inputStream에서 메시지를 읽음
        this.writerHandler = new WriterHandler(input, output); // outputStream에 메시지 작성
        this.sessionManager = sessionManager;
        this.sessionManager.add(this);
    }

    public void close() {
        if (closed) {
            return;
        }
        closeAll(socket, input, output);
    }

    public void send(String message) throws IOException {
        log("session: " + message);
        output.writeUTF(message);
    }

    public void remove() {
        sessionManager.remove(this);
    }

    public void printAll() throws IOException {
        sessionManager.printAll();
    }
}
