package java_basic.poly.ex;

public class PayService {
    Pay pay;
    public void processPay(int amount) {
        boolean result;

        System.out.println("결제 시작");
        result = pay.pay(amount);
        if (result) {
            System.out.println("결제 완료");
        } else {
            System.out.println("결제 실패");
        }
    }

    public void setPay(Pay pay) {
        this.pay = pay;
    }
}
