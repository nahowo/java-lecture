package java_mid1.enumeration.ex0;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        System.out.println(discountService.discount("BASIC", price));
        System.out.println(discountService.discount("GOLD", price));
        System.out.println(discountService.discount("DIAMOND", price));
    }
}
