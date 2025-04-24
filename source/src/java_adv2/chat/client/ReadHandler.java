package java_adv2.chat.client;

import java.io.DataInputStream;
import java.io.IOException;

import static java_adv1.util.MyLogger.log;

public class ReadHandler implements Runnable {
    private final DataInputStream input;
    private final Client client;

    private boolean closed = false;

    public ReadHandler(Client client, DataInputStream input) {
        this.client = client;
        this.input = input;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String received = input.readUTF();
                System.out.println(received);
            }
        } catch (IOException e) {
            log(e);
            client.close();
        }
    }

    public synchronized void close() {
        if (closed) {
            return;
        }
        closed = true;
    }
}
