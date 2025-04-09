package java_mid1.enumeration.ex3;

public class DiscountService {
    public int discount(Grade grade, int price) {
        int discountPercentage = 0;

        if (grade == Grade.BASIC) {
            discountPercentage = 10;
        } else if (grade == Grade.GOLD) {
            discountPercentage = 20;
        } else if (grade == Grade.DIAMOND) {
            discountPercentage = 30;
        } else {
            System.out.println("할인 적용 안됨");
        }
        return price * (discountPercentage) / 100;
    }
}
