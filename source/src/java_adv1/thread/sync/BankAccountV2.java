package java_adv1.thread.sync;

import static java_adv1.util.MyLogger.log;
import static java_adv1.util.ThreadUtils.sleep;

public class BankAccountV2 implements BankAccount {
    private int balance;

    public BankAccountV2(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public synchronized boolean withdraw(int amount) { // synchronized 메서드
        log("거래 시작: " + getClass().getSimpleName());
        log("[검증 시작] 출금액: " + amount + ", 잔액: " + balance);
        // 검증 단계
        if (balance < amount) {
            log("[검증 실패] 출금액: " + amount + ", 잔액: " + balance);
            return false;
        }

        // 출금 단계
        sleep(1000);
        balance -= amount;
        log("[검증 완료] 출금액: " + amount + ", 잔액: " + balance);
        log("거래 종료");
        return true;
    }

    @Override
    public synchronized int getBalance() {
        return balance;
    }
}
