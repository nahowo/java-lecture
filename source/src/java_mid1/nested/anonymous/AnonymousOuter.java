package java_mid1.nested.anonymous;

import java_mid1.nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 3;

    public void process(int parameter) {
        int localVar = 1;
        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value); // 내부 인스턴스 변수
                System.out.println("localVar = " + localVar); // 지역 변수
                System.out.println("parameter = " + parameter); // 파라미터
                System.out.println("outInstanceVar = " + outInstanceVar); // 바깥 인스턴스 변수
            }
        };
        printer.print();
    }

    public static void main(String[] args) {
        AnonymousOuter anonymous = new AnonymousOuter();
        anonymous.process(4);
        System.out.println(anonymous.getClass());
    }
}
