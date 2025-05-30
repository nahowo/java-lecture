package java_adv2.network.tcp.v1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localhost = InetAddress.getByName("localhost");
        System.out.println(localhost);

        InetAddress google = InetAddress.getByName("google.com");
        InetAddress youtube = InetAddress.getByName("youtube.com");
        System.out.println(google);
        System.out.println(youtube);
    }
}
