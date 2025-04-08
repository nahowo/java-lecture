package java_mid1.lang.immutable.change;

public class ImmutableObjMain1 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = new ImmutableObj(20);

        System.out.println("obj1 = " + obj1.getValue());
        System.out.println("obj2 = " + obj2.getValue());
    }
}
