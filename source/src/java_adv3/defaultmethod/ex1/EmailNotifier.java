package java_adv3.defaultmethod.ex1;

public class EmailNotifier implements Notifier{

    @Override
    public void notify(String message) {
        System.out.println("[EMAIL] " + message);
    }
}
