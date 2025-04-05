package java_basic.class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 20};

        String student1Name = "학생1";
        int student1Age = 15;

        String student2Name = "학생2";
        int student2Age = 20;

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("studentName = " + studentNames[i]);
            System.out.println("studentName = " + studentAges[i]);
        }
    }
}
