package java_mid1.enumeration.ex2;

public class DiscountService {
    public int discount(ClassGrade grade, int price) {
        int discountPercentage = 0;

        if (grade == ClassGrade.BASIC) {
            discountPercentage = 10;
        } else if (grade == ClassGrade.GOLD) {
            discountPercentage = 20;
        } else if (grade == ClassGrade.DIAMOND) {
            discountPercentage = 30;
        } else {
            System.out.println("할인 적용 안됨");
        }
        return price * (discountPercentage) / 100;
    }
}
