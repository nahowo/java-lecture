package java_mid1.enumeration.ex1;

import java_mid1.enumeration.ex0.DiscountService;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;

        java_mid1.enumeration.ex0.DiscountService discountService = new DiscountService();
        System.out.println(discountService.discount(StringGrade.BASIC, price));
        System.out.println(discountService.discount(StringGrade.GOLD, price));
        System.out.println(discountService.discount(StringGrade.DIAMOND, price));
    }
}
