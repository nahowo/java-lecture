package java_start.scanner;

import java.util.Scanner;

public class Scanner8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + "는 짝수입니다. ");
        } else {
            System.out.println(a + "는 홀수입니다. ");
        }
    }
}
