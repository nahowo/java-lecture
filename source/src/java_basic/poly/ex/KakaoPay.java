package java_basic.poly.ex;

public class KakaoPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("KakaoPay 시스템 연결");
        System.out.println(amount + "원 송금을 시도합니다. ");
        return true;
    }
}
