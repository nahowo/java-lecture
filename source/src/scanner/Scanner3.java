package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int a = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("더 큰 수는 " + a);
        } else if (a < b) {
            System.out.println("더 큰 수는 " + b);
        }
        else {
            System.out.println("두 수는 같습니다. ");
        }
    }
}
