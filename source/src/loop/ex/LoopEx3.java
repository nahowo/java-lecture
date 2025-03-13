package loop.ex;

public class LoopEx3 {
    public static void main(String[] args) {
        int max = 10;
        int sum1 = 0;
        int i = 1;
        while (i <= max) {
            sum1 += i;
            System.out.println("sum1 = " + sum1);
            i ++;
        }

        int sum2 = 0;
        for (int j = 1; j <= max; j++) {
            sum2 += j;
            System.out.println("sum2 = " + sum2);
        }
    }
}
