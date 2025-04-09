package java_mid1.enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("등급[GUEST, LOGIN, ADMIN]: ");
        try {
            AuthGrade grade = AuthGrade.valueOf(scanner.nextLine().toUpperCase());
            System.out.println("당신의 등급은 " + grade.getDescription() + "입니다. ");
            System.out.println(grade.getPages());
        } catch (Exception e) {
            System.out.println("잘못된 등급입니다. ");
        }
    }
}
