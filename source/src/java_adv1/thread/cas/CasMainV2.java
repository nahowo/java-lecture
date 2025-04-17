package java_adv1.thread.cas;

import java.util.concurrent.atomic.AtomicInteger;

import static java_adv1.util.MyLogger.log;

public class CasMainV2 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        System.out.println("init value: " + atomicInteger.get());

        int result1 = incrementAnsGet(atomicInteger);
        System.out.println("result1 = " + result1);
        int result2 = incrementAnsGet(atomicInteger);
        System.out.println("result2 = " + result2);
    }

    private static int incrementAnsGet(AtomicInteger atomicInteger) {
        int getValue;
        boolean result;
        do {
            getValue = atomicInteger.get();
            log("getValue: " + getValue);
            result = atomicInteger.compareAndSet(getValue, getValue + 1);
            log("result: " + result);
        } while (!result);
        return getValue + 1;
    }
}
