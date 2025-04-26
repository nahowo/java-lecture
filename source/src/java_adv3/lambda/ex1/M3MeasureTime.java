package java_adv3.lambda.ex1;

import java_adv3.lambda.Procedure;

import java.util.Arrays;

public class M3MeasureTime {
    public static void main(String[] args) {
        Procedure one2N = new Procedure() {
            @Override
            public void run() {
                int sum = 0;
                int n = 100;
                for (int i = 1; i <= n; i++) {
                    sum += i;
                }
                System.out.println("[1부터 " + n + "까지 합] 결과: " + sum);
            }
        };

        Procedure sortArray = new Procedure() {
            @Override
            public void run() {
                int[] array = {4, 3, 2, 1};
                System.out.println("원본 배열: " + Arrays.toString(array));
                Arrays.sort(array);
                System.out.println("배열 정렬: " + Arrays.toString(array));
            }
        };

        measure(one2N);
        measure(sortArray);
    }

    static void measure(Procedure procedure) {
        long start = System.nanoTime();
        procedure.run();
        long end = System.nanoTime();
        System.out.println("걸린 시간: " + (end - start) + "ns");
    }
}
