package java_basic.poly.ex;

public class FacebookSender implements Sender {

    @Override
    public void send() {
        System.out.println("페이스북에 발송합니다. ");
    }
}
