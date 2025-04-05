package java_basic.class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2;
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 20;
        student2.grade = 80;

        Student student3;
        student3 = new Student();
        student3.name = "학생3";
        student3.age = 21;
        student3.grade = 96;

        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (int i = 0; i < students.length; i++) {
            System.out.println("name = " + students[i].name);
            System.out.println("age = " + students[i].age);
            System.out.println("grade = " + students[i].grade);
        }
    }
}
