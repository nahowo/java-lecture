package java_mid1.enumeration.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        for (AuthGrade authGrade : AuthGrade.values()) {
            System.out.println("grade: " + authGrade.name() + ", level: " + authGrade.getLevel() + ", description: " + authGrade.getDescription());
        }
    }
}
