package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int bal = 0;
        while (true) {
            menu();

            System.out.print("명렁어를 입력하세요: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    bal = deposit(bal);
                    break;
                case 2:
                    bal = withdraw(bal);
                    break;
                case 3:
                    check(bal);
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다. ");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. ");
            }
        }
    }

    public static int deposit(int bal) {
        System.out.print("입금액을 입력하세요: ");
        int price = scanner.nextInt();
        bal += price;
        System.out.println(price + "원을 입금했습니다. 현재 잔액은 " + bal + "원입니다. ");
        return bal;
    }

    public static int withdraw(int bal) {
        System.out.print("출금액을 입력하세요: ");
        int price = scanner.nextInt();
        if (bal - price < 0) {
            System.out.println("잔액이 부족하여 " + price + "원을 출금할 수 없습니다. 현재 잔액은 " + bal + "원입니다. ");
            return bal;
        }
        bal -= price;
        System.out.println(price + "원을 출금합니다. 현재 잔액은 " + bal + "원입니다. ");
        return bal;
    }

    public static void check(int bal) {
        System.out.println("현재 잔액은 " + bal + "원입니다. ");
    }

    public static void menu() {
        System.out.println("------------------------------------");
        System.out.println("1: 입금 | 2: 출금 | 3: 잔액확인 | 4: 종료");
        System.out.println("------------------------------------");
    }
}
