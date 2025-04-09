package java_mid1.enumeration.ex2;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        System.out.println(discountService.discount(ClassGrade.BASIC, price));
        System.out.println(discountService.discount(ClassGrade.GOLD, price));
        System.out.println(discountService.discount(ClassGrade.DIAMOND, price));
    }
}
