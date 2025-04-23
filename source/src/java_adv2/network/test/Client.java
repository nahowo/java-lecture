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
        String write;
        String received;

        try (Socket socket = new Socket("localhost", PORT);
             DataInputStream input = new DataInputStream(socket.getInputStream());
             DataOutputStream output = new DataOutputStream(socket.getOutputStream())) {

            System.out.print("이름: ");
            write = scanner.nextLine();
            output.writeUTF(write);
            received = input.readUTF();
            System.out.println(received);

            while (true) {
                System.out.print("명령어: ");
                String toSend = scanner.nextLine();
                output.writeUTF(toSend);
                try {
                    while (true) {
                        received = input.readUTF();
                        System.out.println(received);
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException e) {
            log(e);
        }
    }
}
