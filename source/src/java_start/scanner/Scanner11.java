package java_start.scanner;

import java.util.Scanner;

public class Scanner11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자1 를 입력하세요: ");
        int a = scanner.nextInt();
        System.out.print("숫자2 를 입력하세요: ");
        int b = scanner.nextInt();
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("숫자1은 " + a);
        System.out.println("숫자2은 " + b);
    }
}
