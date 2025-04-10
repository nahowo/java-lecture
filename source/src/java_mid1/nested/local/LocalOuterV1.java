package java_mid1.nested.local;

public class LocalOuterV1 {
    private int outInstanceVar = 3;

    public void process(int parameter) {
        int localVar = 1;


        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println("value = " + value); // 내부 인스턴스 변수
                System.out.println("localVar = " + localVar); // 지역 변수
                System.out.println("parameter = " + parameter); // 파라미터
                System.out.println("outInstanceVar = " + outInstanceVar); // 바깥 인스턴스 변수
            }
        }
        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(4);
    }
}
