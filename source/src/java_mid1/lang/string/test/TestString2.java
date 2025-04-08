package java_mid1.lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] strings = {"java", "hello", "jpa"};

        int total = 0;
        for (String string : strings) {
            total += string.length();
        }
        System.out.println("total = " + total);
    }
}
