package java_mid1.enumeration.ref1;

public class EnumRefMain1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        System.out.println(discountService.discount(ClassGrade.BASIC, price));
        System.out.println(discountService.discount(ClassGrade.GOLD, price));
        System.out.println(discountService.discount(ClassGrade.DIAMOND, price));
    }
}
