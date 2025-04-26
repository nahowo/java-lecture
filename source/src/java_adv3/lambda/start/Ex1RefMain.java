package java_adv3.lambda.start;

import java_adv3.lambda.Procedure;

import java.util.Random;

public class Ex1RefMain {
    public static void main(String[] args) {
        helloDice helloDice = new helloDice();
        helloSum helloSum = new helloSum();

        method(helloDice);
        method(helloSum);
    }

    public static void method(Procedure clazz) {
        long start = System.nanoTime();
        clazz.run();
        long end = System.nanoTime();
        System.out.println("time: " + (end - start) + "ns");
    }

    static class helloSum implements Procedure {
        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    static class helloDice implements Procedure {
        @Override
        public void run() {
            int random = new Random().nextInt(6) + 1;
            System.out.println("주사위: " + random);
        }
    }
}
