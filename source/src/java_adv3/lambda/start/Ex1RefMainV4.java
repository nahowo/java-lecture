package java_adv3.lambda.start;

import java_adv3.lambda.Procedure;

import java.util.Random;

public class Ex1RefMainV4 {
    public static void main(String[] args) {
        hello(() -> {
                int random = new Random().nextInt(6) + 1;
                System.out.println("주사위: " + random);
        });
        hello(() -> {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
        });
    }

    public static void hello(Procedure clazz) {
        long start = System.nanoTime();
        clazz.run();
        long end = System.nanoTime();
        System.out.println("time: " + (end - start) + "ns");
    }
}
