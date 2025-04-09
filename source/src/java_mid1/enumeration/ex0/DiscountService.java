package java_mid1.enumeration.ex0;

public class DiscountService {
    public int discount(String grade, int price) {
        int discountPercentage = 0;

        if (grade.equals("BASIC")) {
            discountPercentage = 10;
        } else if (grade.equals("GOLD")) {
            discountPercentage = 20;
        } else if (grade.equals("DIAMOND")) {
            discountPercentage = 30;
        } else {
            System.out.println("할인 적용 안됨");
        }
        return price * (discountPercentage) / 100;
    }
}
