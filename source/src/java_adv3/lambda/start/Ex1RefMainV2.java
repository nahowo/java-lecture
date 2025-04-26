package java_adv3.lambda.start;

import java_adv3.lambda.Procedure;

import java.util.Random;

public class Ex1RefMainV2 {
    public static void main(String[] args) {
        Procedure dice = new Procedure() {
            @Override
            public void run() {
                int random = new Random().nextInt(6) + 1;
                System.out.println("주사위: " + random);
            }
        };
        Procedure sum = new Procedure() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };

        hello(dice);
        hello(sum);
    }

    public static void hello(Procedure clazz) {
        long start = System.nanoTime();
        clazz.run();
        long end = System.nanoTime();
        System.out.println("time: " + (end - start) + "ns");
    }
}
