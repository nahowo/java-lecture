package java_mid1.lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        long current = System.currentTimeMillis();
        System.out.println("current = " + current);

        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        System.out.println(System.getenv());

        System.out.println(System.getProperties());
        System.out.println(System.getProperty("java.version"));

        char[] chars = {'h', 'e', 'l', 'l'};
        char[] chars2 = new char[4];

        System.arraycopy(chars, 0, chars2, 0, chars.length);
        System.out.println(Arrays.toString(chars2));

        System.exit(0);
        System.out.println("hello system");
    }
}
