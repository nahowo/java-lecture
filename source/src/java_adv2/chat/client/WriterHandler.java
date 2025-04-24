package java_adv2.chat.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

import static java_adv1.util.MyLogger.log;

public class WriterHandler implements Runnable {
    private final DataOutputStream output;
    private final Client client;
    private boolean closed = false;

    public WriterHandler(Client client, DataOutputStream output) {
        this.client = client;
        this.output = output;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        try {
            String message = inputName(scanner);
            output.writeUTF(message);
            while (true) {
                String toSend = scanner.nextLine();
                if (toSend.isEmpty()) {
                    continue;
                } else if (toSend.equals("/exit")) {
                    output.writeUTF(toSend);
                    break;
                }
                if (toSend.startsWith("/")) {
                    output.writeUTF(toSend);
                } else {
                    output.writeUTF("/message|" + toSend);
                }
            }
        } catch (IOException e) {
            log(e);
            client.close();
        }
    }

    public void close() {
        if (closed) {
            return;
        }
        closed = true;
    }

    private static String inputName(Scanner scanner) throws IOException {
        log("채팅방에 입장했습니다. ");
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();
        return "/join|" + name;
    }
}
