package java_mid1.lang.string.test;

public class StringTest9 {
    public static void main(String[] args) {
        String email = "nahowo@naver.com";

        String[] strs = email.split("@");
        System.out.println("ID: " + strs[0]);
        System.out.println("domain: " + strs[1]);
    }
}
