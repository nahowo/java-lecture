package java_mid1.nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter(); // nested와 관계가 없기 때문에 없어도 됨
        NestedOuter.Nested nested = new NestedOuter.Nested();

        nested.print();

        System.out.println(nested);
    }
}
