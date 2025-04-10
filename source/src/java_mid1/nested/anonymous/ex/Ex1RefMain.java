package java_mid1.nested.anonymous.ex;


import java.util.Random;

public class Ex1RefMain {
    public static void main(String[] args) {
        Process processDice = new Process() {
            @Override
            public void run() {
                int i = new Random().nextInt(6) + 1;
                System.out.println("주사위: " + i);
            }
        };

        Process processSum = new Process() {
            @Override
            public void run() {
                for (int i = 1; i < 4; i++) {
                    System.out.println("i = " + i);
                }
            }
        };

        hello(processDice);
        hello(processSum);
    }

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        // 변하는 부분(코드 조각)
        process.run();

        System.out.println("프로그램 종료");
    }
}
