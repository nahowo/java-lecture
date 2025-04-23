package java_adv2.network.exception.close.normal;

import java.io.*;
import java.net.Socket;

import static java_adv1.util.MyLogger.log;

public class NormalCloseClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        log("소켓 연결: " + socket);
        InputStream input = socket.getInputStream();

        readByInputStream(input, socket);
        readByBufferedReader(input, socket);
        readByDataStream(input, socket);

        log("연결 종료: " + socket.isClosed());
    }

    private static void readByDataStream(InputStream input, Socket socket) throws IOException{
        DataInputStream dis = new DataInputStream(input);

        try {
            dis.readUTF();
        } catch (EOFException e) {
            log(e);
        } finally {
            dis.close();
            socket.close();
        }
    }

    private static void readByBufferedReader(InputStream input, Socket socket) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(input));
        String string = br.readLine();
        log("readString: " + string);
        if (string == null) {
            input.close();
            socket.close();
        }
    }

    private static void readByInputStream(InputStream input, Socket socket) throws IOException {
        int read = input.read();
        log("read: " + read);
        if (read == -1) {
            input.close();
            socket.close();
        }
    }
}
