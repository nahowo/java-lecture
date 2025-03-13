package array.ex;

import java.util.Scanner;

public class ArrEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: 상품 등록");
        System.out.println("2: 목록");
        System.out.println("2: 프로그램 종료");
        int n;
        while (true) {
            System.out.print("상품의 개수를 입력하세요: ");
            n = scanner.nextInt();
            if (n > 10) {
                System.out.println("상품은 최대 10개까지 등록할 수 있습니다. ");
            }
            else {
                break;
            }
        }
        int cnt = 0;
        String[][] product = new String[n][2];
        while (true) {
            System.out.print("option: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                if (cnt >= n) {
                    System.out.println("상품은 최대 " + n + "개까지 등록할 수 있습니다. ");
                    continue;
                }
                System.out.print("상품명을 입력하세요: ");
                String name = scanner.nextLine();
                System.out.print("가격을 입력하세요: ");
                String price = scanner.nextLine();
                product[cnt][0] = name;
                product[cnt][1] = price;
                cnt ++;
            } else if (option == 2) {
                System.out.println("상품 목록을 출력합니다. ");
                for (int i = 0; i < product.length && product[i][0] != null; i++) {
                    for (int j = 0; j < 2; j ++) {
                        System.out.print(product[i][j] + " ");
                    }
                    System.out.println();
                }
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다. ");
                break;
            } else {
                System.out.println("올바른 옵션을 입력해주세요. ");
            }
        }
    }
}
