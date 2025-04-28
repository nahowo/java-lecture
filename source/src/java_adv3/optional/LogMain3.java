package java_adv3.optional;

public class LogMain3 {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.setDeug(true);
        logger.debug(() -> value100() + value200());

        System.out.println("==debug = false==");
        logger.setDeug(false);
        logger.debug(() -> value100() * value200()); // 호출 안 됨
    }

    static int value100() {
        System.out.println("value100 호출");
        return 100;
    }

    static int value200() {
        System.out.println("value200 호출");
        return 200;
    }
}
