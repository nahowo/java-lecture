package java_start.scanner;

import java.util.Scanner;

public class Scanner6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("숫자를 입력하세요: ");
            int a = scanner.nextInt();
            if (a == 0) {
                System.out.println("sum = " + sum);
                System.out.println("프로그램을 종료합니다. ");
                break;
            }
            sum += a;
        }
    }
}
