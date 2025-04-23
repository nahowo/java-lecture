package java_adv2.network.exception.connect;

import java.io.IOException;
import java.net.Socket;

public class ConnectTimeoutMain1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        try {
            Socket socket = new Socket("192.168.1.230", 45678);
        } catch (IOException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("time taken: " + (end - start) + "ms");
    }
}
