package scanner;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("문자를 입력하세요: ");
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                System.out.println("반복을 종료합니다. ");
                break;
            }
            System.out.println("str = " + str);
        }
    }
}
