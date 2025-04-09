package java_mid1.enumeration.ex1;

public class DiscountService {
    public int discount(String grade, int price) {
        int discountPercentage = 0;

        if (grade.equals(StringGrade.BASIC)) {
            discountPercentage = 10;
        } else if (grade.equals(StringGrade.GOLD)) {
            discountPercentage = 20;
        } else if (grade.equals(StringGrade.DIAMOND)) {
            discountPercentage = 30;
        } else {
            System.out.println("할인 적용 안됨");
        }
        return price * (discountPercentage) / 100;
    }
}
