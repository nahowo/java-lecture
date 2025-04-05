package java_basic.class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder po1 = new ProductOrder();
        ProductOrder po2 = new ProductOrder();
        ProductOrder po3 = new ProductOrder();

        po1.productName = "두부";
        po1.price = 2000;
        po1.quantity = 2;
        po2.productName = "김치";
        po2.price = 30000;
        po2.quantity = 5;
        po3.productName = "콜라";
        po3.price = 3500;
        po3.quantity = 3;

        ProductOrder[] pos = new ProductOrder[]{po1, po2, po3};

        int total = 0;
        for (ProductOrder po : pos) {
            System.out.println(po.productName + ", " + po.price + ", " + po.quantity);
            total += po.price * po.quantity;
        }
        System.out.println("total = " + total);
    }
}
