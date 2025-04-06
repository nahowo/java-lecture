package java_basic.access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(100);
        ba.getBalance();
        ba.withDraw(200);
        ba.withDraw(30);
        ba.getBalance();
    }

}
