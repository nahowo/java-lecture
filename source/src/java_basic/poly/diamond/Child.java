package java_basic.poly.diamond;

public class Child implements InterfaceA, InterfaceB {
    @Override
    public void method() {
        System.out.println("다중 구현");
    }
}
