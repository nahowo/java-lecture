package java_adv2.chat.client;

import java_adv2.chat.server.SessionManager;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import static java_adv1.util.MyLogger.log;
import static java_adv2.network.tcp.SocketCloseUtil.closeAll;

public class Client {
    private static final int PORT = 8080;
    private Socket socket;
    public DataInputStream input;
    public DataOutputStream output;

    private ReadHandler readHandler;
    private WriterHandler writerHandler;
    private String name;
    private boolean closed = false;

    public String getName() {
        return name;
    }

    public void start() throws IOException {
        socket = new Socket("localhost", PORT);
        input = new DataInputStream(socket.getInputStream());
        output = new DataOutputStream(socket.getOutputStream());

        writerHandler = new WriterHandler(this, output);
        readHandler = new ReadHandler(this, input);
        Thread writeThread = new Thread(writerHandler);
        Thread readThread = new Thread(readHandler);
        writeThread.start();
        readThread.start();
    }

    public synchronized void close() {
        if (closed) {
            return;
        }
        writerHandler.close();
        readHandler.close();
        closeAll(socket, input, output);
        closed = true;
    }
}
