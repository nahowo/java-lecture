package java_basic.ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 16, 89);
        Student student3 = createStudent("학생3", 20, 97);

        printStudent(student1);
        printStudent(student2);
        printStudent(student3);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    public static void printStudent(Student student) {
        System.out.println("student.name = " + student.name);
        System.out.println("student.age = " + student.age);
        System.out.println("student.grade = " + student.grade);
    }
}
