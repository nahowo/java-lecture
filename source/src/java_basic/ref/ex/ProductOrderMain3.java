package java_basic.ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("개수: ");
        int n = scanner.nextInt();
        scanner.nextLine();


        ProductOrder[] pos = new ProductOrder[n];
        for (int i = 0; i < n; i++) {
            System.out.print("이름: ");
            String name = scanner.nextLine();
            System.out.print("개수: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            System.out.print("금액: ");
            int price = scanner.nextInt();
            scanner.nextLine();
            pos[i] = createPo(name, quantity, price);
        }

        int sum = sum(pos);
        print(pos);
        System.out.println("total = " + sum);
    }

    static ProductOrder createPo(String pn, int price, int quantity) {
        ProductOrder po = new ProductOrder();
        po.productName = pn;
        po.price = price;
        po.quantity = quantity;
        return po;
    }

    static int sum(ProductOrder[] pos) {
        int total = 0;
        for (ProductOrder po : pos) {
            total += po.price * po.quantity;
        }
        return total;
    }

    static void print(ProductOrder[] pos) {
        for (ProductOrder po : pos) {
            System.out.println("po.productName = " + po.productName);
            System.out.println("po.price = " + po.price);
            System.out.println("po.quantity = " + po.quantity);
        }
    }
}
