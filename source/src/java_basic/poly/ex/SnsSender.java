package java_basic.poly.ex;

public class SnsSender implements Sender {
    @Override
    public void send() {
        System.out.println("SMS를 발송합니다. ");
    }
}
