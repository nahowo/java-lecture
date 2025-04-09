package java_mid1.lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iteration = 1_000_000_000;
        long startTime, endTime;

        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("time: " + (endTime - startTime) + "ms");

        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            sumWrapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("time: " + (endTime - startTime) + "ms");
    }
}
