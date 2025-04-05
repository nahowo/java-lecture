package java_basic.oop1.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
        status();
    }

    void withDraw(int amount) {
        if (balance < amount) {
            System.out.println("금액이 부족합니다. ");
        } else {
            balance -= amount;
        }
        status();
    }

    void status() {
        System.out.println("balance = " + balance);
    }
}
