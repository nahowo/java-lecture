package java_basic.poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();

        // down casting(parent -> child)
        Child child = (Child) poly;
        child.childMethod();

        // temporary down casting
        ((Child) poly).childMethod();
    }
}
