package java_mid1.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int outInstanceVar = 3;

    public Printer process(int parameter) {
        int localVar = 1; // 스택 프레임이 종료되는 순간 제거됨


        class LocalPrinter implements Printer{
            int value = 9;
            int value2 = 10;

            @Override
            public void print() {
                System.out.println("localVar = " + localVar); // 지역 변수
                System.out.println("parameter = " + parameter); // 파라미터
                // 인스턴스는 지역 변수보다 오래 살아남음
                System.out.println("value = " + value); // 내부 인스턴스 변수
                System.out.println("outInstanceVar = " + outInstanceVar); // 바깥 인스턴스 변수
                value2 = 11;
                System.out.println("value2 = " + value2);
            }
        }
        LocalPrinter localPrinter = new LocalPrinter();
        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuterV1 = new LocalOuterV3();
        Printer printer = localOuterV1.process(4);
        // Printer를 반환받고 process() 스택 프레임이 제거된 이후에 print()를 실행
        printer.print();
        Field[] declaredFields = printer.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
    }
}
