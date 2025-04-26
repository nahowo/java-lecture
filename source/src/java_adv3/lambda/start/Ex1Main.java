package java_adv3.lambda.start;

import java_adv3.lambda.Procedure;

import java.util.Random;

public class Ex1Main {
    public static void main(String[] args) {
        helloDice();
        helloSum();
    }

    public static void helloDice() {
        long start = System.nanoTime();
        int random = new Random().nextInt(6) + 1;
        System.out.println("주사위: " + random);
        long end = System.nanoTime();
        System.out.println("time: " + (end - start) + "ns");
    }

    public static void helloSum() {
        long start = System.nanoTime();
        for (int i = 1; i <= 3; i++) {
            System.out.println("i = " + i);
        }
        long end = System.nanoTime();
        System.out.println("time: " + (end - start) + "ns");
    }
}
