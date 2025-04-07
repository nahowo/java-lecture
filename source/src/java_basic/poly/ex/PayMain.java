package java_basic.poly.ex;

public class PayMain {
    public static void main(String[] args) {
        PayService payService = new PayService();
        process(payService, new KakaoPay(),100);
        process(payService, new NaverPay(), 30000);
        process(payService, new TossPay(), 4000);
    }

    private static void process(PayService payService, Pay pay, int amount) {
        payService.setPay(pay);
        payService.processPay(amount);
        System.out.println("---");
    }

}
