package java_start.array.ex;

import java.util.Scanner;

public class ArrEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("개수를 입력하세요: ");
        int cnt = scanner.nextInt();
        int[] numbers = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            System.out.print("정수를 입력하세요: ");
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            if (max < number) {
                max = number;
            }
            if (min > number) {
                min = number;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
