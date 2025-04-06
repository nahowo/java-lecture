package java_basic.construct;

public class MemberInitMain {
    public static void main(String[] args) {
        MemberInit m1 = new MemberInit();
        m1.initMember("user1", 21, 100);
        MemberInit m2 = new MemberInit();
        m2.initMember("user2", 23, 90);

        print(m1);
        print(m2);
    }
    static void print(MemberInit m) {
        System.out.println(m.name + ", " + m.age + ", " +  m.grade);
    }
}
