package java_mid1.lang.wrapper;

public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        int value = 10;
        System.out.println(compareTo(value, 5));
        System.out.println(compareTo(value, 10));
        System.out.println(compareTo(value, 20));

    }

    public static int compareTo(int value, int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }
}
