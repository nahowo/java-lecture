package java_start.loop.ex;

public class LoopEx1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("i = " + i);
            i ++;
        }
        System.out.println();
        for (int j = 1; j <= 10; j++) {
            System.out.println("j = " + j);
        }
    }
}
