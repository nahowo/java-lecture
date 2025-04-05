package java_start.method;

public class Method2 {
    public static boolean isOdd(int i) {
        if (i % 2 != 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isOdd(3));
    }
}
