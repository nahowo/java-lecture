package java_adv1.thread.sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java_adv1.util.MyLogger.log;
import static java_adv1.util.ThreadUtils.sleep;

public class BankAccountV5 implements BankAccount {
    private int balance;
    private final Lock lock = new ReentrantLock();

    public BankAccountV5(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public boolean withdraw(int amount) {
        log("거래 시작: " + getClass().getSimpleName());

        if (!lock.tryLock()) { // synchronized -> lock
            log("[진입 실패] 이미 처리중인 작업이 있습니다. ");
            return false;
        }
        try {
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
        } finally { // 오류가 터지면 unlock이 풀리지 않기 때문에 무조건 try - finally로 정리해줘야 함
            lock.unlock(); // lock을 하면 무조건 unlock을 해줘야 함
        }

        log("거래 종료");
        return true;
    }

    @Override
    public int getBalance() {
        try {
            lock.lock();
            return balance;
        } finally {
            lock.unlock();
        }
    }
}
