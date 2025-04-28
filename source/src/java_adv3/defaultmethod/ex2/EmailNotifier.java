package java_adv3.defaultmethod.ex2;

import java.time.LocalDateTime;

public class EmailNotifier implements Notifier {

    @Override
    public void notify(String message) {
        System.out.println("[EMAIL] " + message);
    }

    @Override
    public void scheduledNotify(String message, LocalDateTime schedule) {
        System.out.println("[EMAIL 전용 스케줄링] " + message + "(" + schedule + ")");
    }
}
