package cond;

public class Switch2 {
    public static void main(String[] args) {
        int grade = 4;

        int coupon = switch (grade) {
            case 1 -> 5;
            case 2 -> 10;
            case 3 -> 15;
            default -> 0;
        };
        System.out.println("coupon = " + coupon);
    }
}
