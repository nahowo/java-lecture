package java_basic.poly.diamond;

public class DIamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.method();
        InterfaceA b = new Child();
        b.method();
    }
}
