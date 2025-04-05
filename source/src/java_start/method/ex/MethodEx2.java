package java_start.method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        print("hello", 3);
    }

    public static void print(String msg, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(msg);
        }
    }
}
