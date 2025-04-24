package java_adv2.chat.client;

import java.io.IOException;

public class ClientMain {
    private static final int PORT = 8080;
    public static void main(String[] args) throws InterruptedException, IOException {
        Client client = new Client();
        client.start();
    }
}
