package java_basic.construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    MemberInit initMember(String name, int age, int grade) {
        MemberInit m = new MemberInit();
        this.name = name;
        this.age = age;
        this.grade = grade;
        return m;
    }
}
