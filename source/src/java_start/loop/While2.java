package java_start.loop;

public class While2 {
    public static void main(String[] args) {
        int endNum = 5;
        int i = 0;
        int sum = 0;
        while (i <= endNum) {
            sum += i;
            i ++;
        }
        System.out.println("sum = " + sum);
    }
}
