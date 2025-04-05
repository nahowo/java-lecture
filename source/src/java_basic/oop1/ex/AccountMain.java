package java_basic.oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account a = new Account();
        a.balance = 10000;
        a.deposit(1000);
        a.withDraw(3000);
        a.withDraw(30000);
    }
}
