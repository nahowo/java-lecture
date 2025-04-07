package java_basic.memory.ex;

public class MathArraryUtils {
    private MathArraryUtils() {
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return total;
    }

    public static double average(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
