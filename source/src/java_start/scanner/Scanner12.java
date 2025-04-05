package java_start.scanner;

import java.util.Scanner;

public class Scanner12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자1 를 입력하세요: ");
        int a = scanner.nextInt();
        System.out.print("숫자2 를 입력하세요: ");
        int b = scanner.nextInt();
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
}
