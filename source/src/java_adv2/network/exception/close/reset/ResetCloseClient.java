package java_adv2.network.exception.close.reset;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;

import static java_adv1.util.MyLogger.log;

public class ResetCloseClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("localhost", 12345);
        log("소켓 연결: " + socket);
        InputStream input = socket.getInputStream();
        OutputStream output = socket.getOutputStream();

        // client <- server: FIN
        Thread.sleep(1000);

        // client -> server: push(1), 잘못된 연결
        output.write(1);

        Thread.sleep(1000);

        try {
            int read = input.read(); // SocketException: Connection reset
        } catch (SocketException e) {
            e.printStackTrace();
        }

        try {
            output.write(1); // SocketException: Broken pipe
        } catch (SocketException e) {
            e.printStackTrace();
        }

        log("연결 종료: " + socket.isClosed());
    }
}
