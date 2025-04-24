package java_adv2.network.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import static java_adv1.util.MyLogger.log;

public class Client {
    private static final int PORT = 8080;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (Socket socket = new Socket("localhost", PORT);
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            DataInputStream input = new DataInputStream(socket.getInputStream())) {
            Thread.sleep(1000);
            System.out.println("[채팅방에 입장했습니다. ]");
            while (true) {
                String toSend = scanner.nextLine();
                // session에 메시지 전달
                output.writeUTF(toSend);
                // 메시지 받아오기
//                log("client: " + input.readUTF());
            }
        } catch (IOException e) {
            log(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
