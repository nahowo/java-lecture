package array.ex;

import java.util.Scanner;

public class ArrEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요: ");
        int cnt = scanner.nextInt();
        int[][] numbers = new int[cnt][3];
        int[] total = new int[cnt];
        String[] sub = {"국어", "영어", "수학"};
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < 3; j ++) {
                System.out.print(i + "번 학생의 " + sub[j] + " 점수를 입력하세요: ");
                int score = scanner.nextInt();
                numbers[i][j] = score;
                total[i] += score;
            }
        }

        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < 3; j ++) {
                System.out.print(i + "번 학생의 " + sub[j] + " 점수는 " + numbers[i][j] + "입니다. ");
            }
            System.out.println();
            System.out.println(i + "번 학생의 총 점수는 " + total[i] + "입니다. ");
        }
    }
}
