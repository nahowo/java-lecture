package java_basic.construct;

public class MemberContructor {
    String name;
    int age;
    int grade;

    MemberContructor(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    MemberContructor(String name, int age) {
        this(name, age, 50);
    }
}
