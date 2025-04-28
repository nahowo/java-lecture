package java_adv3.defaultmethod.ex2;

import java.time.LocalDateTime;

public interface Notifier {
    void notify(String message);

    default void scheduledNotify(String message, LocalDateTime schedule) {
        System.out.println("[기본 스케줄링] " + message + "(" + schedule + ")");
    };
}
