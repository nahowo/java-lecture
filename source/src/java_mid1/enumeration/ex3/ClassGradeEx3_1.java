package java_mid1.enumeration.ex3;

import static java_mid1.enumeration.ex3.Grade.*;

public class ClassGradeEx3_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        System.out.println(discountService.discount(BASIC, price));
        System.out.println(discountService.discount(GOLD, price));
        System.out.println(discountService.discount(DIAMOND, price));
        System.out.println(discountService.discount(BRONZE, price));
    }
}
