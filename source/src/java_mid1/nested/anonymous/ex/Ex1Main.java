package java_mid1.nested.anonymous.ex;

import java.util.Random;

public class Ex1Main {
    public static void main(String[] args) {
        helloDice();
        hellosum();
    }
    public static void helloDice() {
        System.out.println("프로그램 시작");
        int i = new Random().nextInt(6) + 1;
        System.out.println("주사위: " + i);
        System.out.println("프로그램 종료");
    }

    public static void hellosum() {
        System.out.println("프로그램 시작");
        for (int i = 1; i < 4; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("프로그램 종료");
    }
}
