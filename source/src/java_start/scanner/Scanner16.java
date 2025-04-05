package java_start.scanner;

import java.util.Scanner;

public class Scanner16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: 상품 입력");
        System.out.println("2: 결제");
        System.out.println("2: 프로그램 종료");
        int sum = 0;
        while (true) {
            System.out.print("option: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                System.out.print("상품명을 입력하세요: ");
                String name = scanner.nextLine();
                System.out.print("가격을 입력하세요: ");
                int price = scanner.nextInt();
                System.out.print("수량을 입력하세요: ");
                int cnt = scanner.nextInt();
                sum += price * cnt;
            } else if (option == 2) {
                System.out.println("총 금액은 " + sum + "원입니다. ");
                System.out.println("안녕히 가십시오. ");
                System.out.println();
                sum = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다. ");
                break;
            } else {
                System.out.println("올바른 옵션을 입력해주세요. ");
            }
        }
    }
}
