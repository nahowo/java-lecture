package java_mid1.lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        int value = 7;
        Integer boxedValue = value; // autoboxing

        System.out.println("boxedValue = " + boxedValue);

        int unboxedValue = boxedValue; // autounboxing
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
