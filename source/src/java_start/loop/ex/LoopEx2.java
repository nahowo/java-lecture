package java_start.loop.ex;

public class LoopEx2 {
    public static void main(String[] args) {
        int i = 2;
        for (int cnt = 0; cnt <= 10; cnt += 1) {
            System.out.println("i = " + i);
            i += 2;
        }
    }
}
