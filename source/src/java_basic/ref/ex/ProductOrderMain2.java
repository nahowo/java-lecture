package java_basic.ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder po1 = createPo("두부", 1000, 3);
        ProductOrder po2 = createPo("김치", 20000, 1);
        ProductOrder po3 = createPo("맥주", 2500, 4);

        ProductOrder[] pos = new ProductOrder[]{po1, po2, po3};
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
