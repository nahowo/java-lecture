package method;

public class Method1 {
    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + " + " + b + " = " + add(a, b));
        a = 20;
        b = 30;
        System.out.println(a + " + " + b + " = " + add(a, b));
        a = 4;
        b = 15;
        System.out.println(a + " + " + b + " = " + add(a, b));

    }
}
