package java_start.array.ex;

import java.util.Scanner;

public class ArrEx3 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("정수를 입력하세요: ");
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }

        for (int i = numbers.length - 1; i >= 0; i --) {
            System.out.println("number[" + i + "] = " + numbers[i]);
        }
    }
}
