package java_basic.poly.ex;

public class EmailSender implements Sender {
    @Override
    public void send() {
        System.out.println("이메일을 발송합니다. ");
    }
}
