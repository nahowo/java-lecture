package java_mid1.enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        System.out.println(discountService.discount("BRONZE", price));
    }
}
