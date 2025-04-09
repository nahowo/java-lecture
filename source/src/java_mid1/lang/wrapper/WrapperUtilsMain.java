package java_mid1.lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10");
        int intValue = Integer.parseInt("10");

        int compareRet = i1.compareTo(20);
        System.out.println("compareRet = " + compareRet);

        System.out.println(Integer.sum(10, 20));
        System.out.println(Integer.min(10, 20));
    }
}
