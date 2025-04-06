package java_basic.construct;

public class MemberConstructorMain1 {
    public static void main(String[] args) {
        MemberContructor m1 = new MemberContructor("mem1", 12, 100);
        System.out.println("name: " + m1.name + ", age: " + m1.age + ", grade: " + m1.grade);

        MemberContructor m2 = new MemberContructor("mem2", 20);
        System.out.println("name: " + m2.name + ", age: " + m2.age + ", grade: " + m2.grade);
    }
}
