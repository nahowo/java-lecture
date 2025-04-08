package java_mid1.lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt java hello hello kitty";
        String key = "hello";
        int count = 0;

        int idx = str.indexOf(key);
        str = str.substring(idx + key.length());
        while (idx != -1) {
            count += 1;
            idx = str.indexOf(key);
            str = str.substring(idx + key.length());
        }
        System.out.println(count);
    }
}
