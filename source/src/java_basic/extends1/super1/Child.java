package java_basic.extends1.super1;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void method() {
        System.out.println("child method");
    }

    public void call() {
        System.out.println("this value = " + value);
        System.out.println("super value = " + super.value);
        super.method();
    }
}
