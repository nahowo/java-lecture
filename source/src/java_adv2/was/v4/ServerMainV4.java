package java_adv2.was.v4;

import java.io.IOException;

public class ServerMainV4 {
    public static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        HttpServerV4 server = new HttpServerV4(PORT);
        server.start();
    }
}
