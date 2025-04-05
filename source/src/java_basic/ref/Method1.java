package java_basic.ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        setStudent(student1, "학생1", 15, 90);
        setStudent(student2, "학생2", 16, 89);
        setStudent(student3, "학생3", 20, 97);

        printStudent(student1);
        printStudent(student2);
        printStudent(student3);
    }

    public static void printStudent(Student student) {
        System.out.println("student.name = " + student.name);
        System.out.println("student.age = " + student.age);
        System.out.println("student.grade = " + student.grade);
    }

    public static void setStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
}
