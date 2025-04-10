package java_mid1.nested.anonymous.ex;

import java_mid1.nested.local.Printer;

public class Ex0RefMain {
    public void hello(String param) {
        Printer printer = new Printer() {
            @Override
            public void print() {
                System.out.println("프로그램 시작");
                System.out.println("Hello " + param + "!");
                System.out.println("프로그램 종료");
            }
        };
        printer.print();
    }
    public static void main(String[] args) {
        Ex0RefMain main = new Ex0RefMain();
        main.hello("java");
        main.hello("spring");
        main.hello("darkness my old friend");
    }
}
