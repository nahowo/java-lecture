package java_mid1.lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        String[] strs = str.split(",");
        for (String s : strs) {
            System.out.println(s);
        }

        String joinStr = String.join("-", strs);
        System.out.println("joinStr = " + joinStr);
    }
}
