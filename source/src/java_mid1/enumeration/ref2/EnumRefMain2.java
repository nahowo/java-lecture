package java_mid1.enumeration.ref2;

public class EnumRefMain2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        System.out.println(discountService.discount(Grade.BASIC, price));
        System.out.println(discountService.discount(Grade.GOLD, price));
        System.out.println(discountService.discount(Grade.DIAMOND, price));
    }
}
