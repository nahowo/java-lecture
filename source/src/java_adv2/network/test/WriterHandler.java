package java_adv2.network.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;

import static java_adv1.util.MyLogger.log;


public class WriterHandler implements Runnable {
    private final DataInputStream input;

    private final DataOutputStream output;

    public WriterHandler(DataInputStream input, DataOutputStream output) throws IOException {
        this.input = input;
        this.output = output;
    }

    @Override
    public void run() {

        while (true) {
            try {
                String message = input.readUTF();
                log("wh: " + message);
            } catch (EOFException e) {
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
