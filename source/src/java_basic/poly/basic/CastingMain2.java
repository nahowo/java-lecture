package java_basic.poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        // up casting
        Parent parent = child; // (Parent) 생략 가능
        Parent parent2 = (Parent) child;

        parent.parentMethod();
        parent2.parentMethod();
    }
}
