package java_mid1.lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
//        Integer newInteger = new Integer(10); // deprecated
        Integer newInteger = Integer.valueOf(200); // -128 ~ 127
        Integer newInteger2 = Integer.valueOf(200);
        System.out.println("newInteger = " + newInteger);
        System.out.println(newInteger == newInteger2);
        System.out.println(newInteger.equals(newInteger2));

        Long newLong = Long.valueOf(100);
        System.out.println("newLong = " + newLong);

        int unboxed = newInteger.intValue();
        System.out.println("unboxed = " + unboxed);
    }
}
