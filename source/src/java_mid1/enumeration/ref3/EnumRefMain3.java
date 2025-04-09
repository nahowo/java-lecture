package java_mid1.enumeration.ref3;

public class EnumRefMain3 {
    public static void main(String[] args) {
        int price = 10000;

        for (Grade grade : Grade.values()) {
            printDiscount(grade, price);
        }
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + "의 할인 금액: " + grade.discount(price));
    }
}
