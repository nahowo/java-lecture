package java_start.scanner;

import java.util.Scanner;

public class Scanner9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("메뉴를 입력하세요: ");
        String name = scanner.nextLine();
        System.out.print("가격을 입력하세요: ");
        int price = scanner.nextInt();
        System.out.print("수량을 입력하세요: ");
        int cnt = scanner.nextInt();
        System.out.println(name + " 메뉴의 총 가격은 " + (price * cnt) + "원입니다. ");
    }
}
