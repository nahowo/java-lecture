package java_mid1.lang.string.test;

public class StringTest10 {
    public static void main(String[] args) {
        String str = "apple,pineapple,blueberry";
        String[] strs = str.split(",");

        System.out.println(String.join("->", strs));
    }
}
