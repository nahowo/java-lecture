package java_basic.poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        Parent parent2 = new Child();
        call(parent1);
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        if (parent instanceof Child) {
            System.out.println("Child instance");
            ((Child) parent).childMethod();
        } else {
            System.out.println("Parent instance");
        }
    }
}
