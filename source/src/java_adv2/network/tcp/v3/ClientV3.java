package java_adv2.network.tcp.v3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import static java_adv1.util.MyLogger.log;

public class ClientV3 {
    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        log("클라이언트 시작");
        Socket socket = new Socket("localhost", PORT);

        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        log("소켓 연결: " + socket);

        while (true) {
            System.out.print("전송 문자: ");
            String toSend = scanner.nextLine();
            log("client -> server: " + toSend);
            output.writeUTF(toSend);
            if (toSend.equals("exit")) {
                break;
            }

            String received = input.readUTF();
            log("client <- server: " + received);
        }


        log("연결 종료: " + socket);
        input.close();
        output.close();
        socket.close();
    }
}
