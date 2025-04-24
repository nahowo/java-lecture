package java_adv2.network.test;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

import static java_adv1.util.MyLogger.log;

public class ReadHandler implements Runnable {
    private final DataInputStream input;
    private final Session session;
    private String name;
    private final Scanner scanner = new Scanner(System.in);

    public ReadHandler(DataInputStream input, Session session) throws IOException {
        this.input = input;
        this.session = session;
    }

    @Override
    public void run() {

        try {
            while (true) {
                String received = input.readUTF();
                log("rh: " + received);
                String[] tmp = received.split("\\|");
                String cmd = tmp[0];
                if (cmd.equals("/join")) {
                    this.name = tmp[1];
                    send(tmp[1] + "님이 입장했습니다. ");
                } else if (cmd.equals("/message")) {
                    send(this.name + " | " + tmp[1]);
                } else if (cmd.equals("/change")) {
                    this.name = tmp[1];
                } else if (cmd.equals("/users")) {
                    session.printAll();
                } else if (cmd.equals("/exit")) {
                    session.close();
                    break;
                }
            }
        } catch (IOException e) {
            log(e);
        } finally {
            session.remove();
            session.close();
        }
    }

    public synchronized void send(String message) throws IOException {
        session.sessionManager.send(message);
    }
}
