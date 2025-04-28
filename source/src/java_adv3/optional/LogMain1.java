package java_adv3.optional;

public class LogMain1 {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.setDeug(true);
        logger.debug(10 + 20);

        logger.setDeug(false);
        logger.debug(100 * 200);
    }
}
