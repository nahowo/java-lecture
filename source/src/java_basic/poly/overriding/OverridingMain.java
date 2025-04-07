package java_basic.poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("value: " + child.value);
        child.method();

        Parent parent = new Parent();
        System.out.println("value: " + parent.value);
        parent.method();

        Parent poly = new Child();
        System.out.println("value: " + poly.value);
        poly.method(); // 메서드 오버라이딩

        Parent poly2 = new Child2();
        poly2.method();
    }
}
