package java_mid1.nested.anonymous.ex;


import java.util.Random;

public class Ex2RefMain {
    public static void main(String[] args) {
        hello(() -> {
            int i = new Random().nextInt(6) + 1;
            System.out.println("주사위: " + i);
        });
        hello(() -> {
            for (int i = 1; i < 4; i++) {
                System.out.println("i = " + i);
            }
        });
    }

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        // 변하는 부분(코드 조각)
        process.run();

        System.out.println("프로그램 종료");
    }
}
