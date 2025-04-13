package java_mid2.collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            System.out.print("정수를 입력하세요: ");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            list.add(n);
            scanner.nextLine();
        }

        int total = 0;
        System.out.println(Arrays.toString(list.toArray()));
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        double avg = (double) total / list.size();
        System.out.println("total = " + total);
        System.out.println("avg = " + avg);
    }
}
