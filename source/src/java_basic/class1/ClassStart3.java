package java_basic.class1;

public class ClassStart3 {
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

        System.out.println("student1 = " + student1.name);
        System.out.println("student1 = " + student1.age);
        System.out.println("student1 = " + student1.grade);
        System.out.println("student2 = " + student2.name);
        System.out.println("student2 = " + student2.age);
        System.out.println("student2 = " + student2.grade);
        System.out.println("student3 = " + student3.name);
        System.out.println("student3 = " + student3.age);
        System.out.println("student3 = " + student3.grade);
    }
}
