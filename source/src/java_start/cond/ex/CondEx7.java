package java_start.cond.ex;

public class CondEx7 {
    public static void main(String[] args) {
        int a = 10;
        String ret = a % 2 == 0 ? "짝수" : "홀수";
        System.out.println("a는 " + ret + "입니다. ");
    }
}
