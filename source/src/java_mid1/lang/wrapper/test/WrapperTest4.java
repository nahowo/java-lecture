package java_mid1.lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "10";
        System.out.println(Integer.valueOf(str));

        Integer integer = Integer.valueOf(10);
        int int1 = integer;
        System.out.println("int1 = " + int1);

        Integer integer1 = int1;
        System.out.println("integer1 = " + integer1);
    }
}
