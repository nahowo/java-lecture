package array.ex;

import java.util.Scanner;

public class ArrEx2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("정수를 입력하세요: ");
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.println("number = " + number);
        }
    }
}
