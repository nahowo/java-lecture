package java_adv3.functional;

public class ImmutableMain1 {
    public static void main(String[] args) {
        MutablePerson m1 = new MutablePerson("Lee", 30);
        MutablePerson m2 = m1;

        m2.setAge(20);
        System.out.println(m2.getAge());

        ImmutablePerson m3 = new ImmutablePerson("Park", 24);
        ImmutablePerson m4 = m3.withAge(28);
        System.out.println("m4.getAge() = " + m4.getAge());
        System.out.println("m3.getAge() = " + m3.getAge());

    }
}
