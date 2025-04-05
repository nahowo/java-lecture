package java_start.array.ex;

public class ArrEx1 {
    public static void main(String[] args) {
        int[] score = {10, 20, 30, 40};
        int sum = 0;
        for (int i : score) {
            sum += i;
        }
        System.out.println("평균은 " + ((double) sum / score.length) + "입니다. ");
    }
}
