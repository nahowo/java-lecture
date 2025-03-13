package scanner;

import java.util.Scanner;

public class Scanner14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("가격을 입력하세요: ");
            int price = scanner.nextInt();
            if (price == -1) {
                System.out.println("총 금액은 " + sum + "입니다. ");
                System.out.println("프로그램을 종료합니다. ");
                break;
            }
            System.out.print("수량을 입력하세요: ");
            int cnt = scanner.nextInt();
            sum += price * cnt;
        }
    }
}
