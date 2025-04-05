package java_start.array;

public class Array1 {
    public static void main(String[] args) {
        int[] students;
        students = new int[5];
        students[0] = 10;
        students[1] = 20;
        students[2] = 30;
        students[3] = 40;
        students[4] = 50;

        for (int i = 0; i < 5; i++) {
            System.out.println("students " + i + "=  " + students[i]);
        }
        System.out.println(students);
    }
}
