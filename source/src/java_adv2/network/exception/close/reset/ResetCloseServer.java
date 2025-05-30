package java_adv2.network.exception.close.reset;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static java_adv1.util.MyLogger.log;

public class ResetCloseServer {
    public static void main(String[] args) throws InterruptedException, IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        Socket socket = serverSocket.accept();

        log("소켓 연결: " + socket);

        socket.close();
        serverSocket.close();
        log("소켓 종료");
    }
}
