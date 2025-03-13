package cond;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch (grade) {
            case 3:
                coupon = 20;
                break;
            case 2:
                coupon = 10;
                break;
            case 1:
                coupon = 5;
                break;
            default:
                coupon = 0;
        }
        System.out.println("coupon = " + coupon);
    }
}
