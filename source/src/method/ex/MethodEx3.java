package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;
        balance = deps(balance, 2000);
        balance = withd(balance, 200000);
        balance = withd(balance, 4000);
    }

    public static int deps(int bal, int price) {
        System.out.println(price + "원을 입금했습니다. ");
        bal += price;
        System.out.println("현재 잔액은 " + bal + "원입니다. ");
        return bal;
    }

    public static int withd(int bal, int price) {
        if (bal - price < 0) {
            System.out.println("잔액이 부족합니다. " + price + "원을 출금할 수 없습니다. 현재 잔액은 " + bal + "원입니다. ");
            return bal;
        }
        bal -= price;
        System.out.println(price + "원을 출금합니다. ");
        System.out.println("현재 잔액은 " + bal + "원입니다. ");
        return bal;
    }
}
