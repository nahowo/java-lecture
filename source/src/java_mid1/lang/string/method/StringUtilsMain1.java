package java_mid1.lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String string = "Hello, Java!";

        String numString = String.valueOf(num);
        System.out.println(numString);

        System.out.println(String.valueOf(bool));
        System.out.println(String.valueOf(obj));

        String numString2 = "" + num;
        System.out.println("numString2 = " + numString2);

        char[] chars = string.toCharArray();
        System.out.println("chars = " + chars);
        for (char aChar : chars) {
            System.out.print(aChar);
        }
    }
}
