package scanner;

import java.util.Scanner;

public class Scanner7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        System.out.println("이름은 " + name + "이고 나이는 " + age + "입니다. ");

    }
}
