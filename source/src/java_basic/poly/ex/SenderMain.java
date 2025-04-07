package java_basic.poly.ex;

public class SenderMain {
    public static void main(String[] args) {
        Sender[] senders = new Sender[]{new EmailSender(), new FacebookSender(), new SnsSender()};

        for (Sender sender : senders) {
            sender.send();
        }
    }
}
