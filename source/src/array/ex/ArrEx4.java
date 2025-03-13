package array.ex;

import java.util.Scanner;

public class ArrEx4 {
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
        int sum = 0;
        double avg;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("sum = " + sum);
        avg = (double) sum / cnt;
        System.out.println("avg = " + avg);
    }
}
