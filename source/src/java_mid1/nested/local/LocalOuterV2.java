package java_mid1.nested.local;

public class LocalOuterV2 {
    private int outInstanceVar = 3;

    public void process(int parameter) {
        int localVar = 1;


        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value); // 내부 인스턴스 변수
                System.out.println("localVar = " + localVar); // 지역 변수
                System.out.println("parameter = " + parameter); // 파라미터
                System.out.println("outInstanceVar = " + outInstanceVar); // 바깥 인스턴스 변수
            }
        }
        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuterV1 = new LocalOuterV2();
        localOuterV1.process(4);
    }
}
