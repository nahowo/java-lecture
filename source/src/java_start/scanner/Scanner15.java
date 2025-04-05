package java_start.scanner;

import java.util.Scanner;

public class Scanner15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
//        while (true) {
//            System.out.print("숫자를 입력하세요: ");
//            int num = java_start.scanner.nextInt();
//            if (num == 0) {
//                System.out.println("총 합은 " + sum + "입니다. ");
//                System.out.println("평균값은 "+ ((double) sum / cnt) + "입니다. ");
//                System.out.println("프로그램을 종료합니다. ");
//                break;
//            }
//            sum += num;
//            cnt++;
//        }

        int num;
        while ((num = scanner.nextInt()) != 0) {
            sum += num;
            cnt++;
        }
        System.out.println("총 합은 " + sum + "입니다. ");
        System.out.println("평균값은 "+ ((double) sum / cnt) + "입니다. ");
        System.out.println("프로그램을 종료합니다. ");
    }
}
