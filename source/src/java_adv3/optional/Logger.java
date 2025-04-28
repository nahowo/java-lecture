package java_adv3.optional;

import java.util.function.Supplier;

public class Logger {
    private boolean isDebug = false;

    public boolean isDeug() {
        return isDebug;
    }

    public void setDeug(boolean debug) {
        isDebug = debug;
    }

    public void debug(Object message) {
        if (isDebug) {
            System.out.println("[DEBUG] " + message);
        }
    }

    public void debug(Supplier<?> supplier) {
        if (isDebug) {
            System.out.println("[DEBUG] " + supplier.get());
        }
    }
}
