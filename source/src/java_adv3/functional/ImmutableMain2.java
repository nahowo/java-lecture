package java_adv3.functional;

import java.util.List;

public class ImmutableMain2 {
    public static void main(String[] args) {
        MutablePerson m1 = new MutablePerson("Lee", 30);
        MutablePerson m2 = new MutablePerson("Park", 24);
        List<MutablePerson> original = List.of(m1, m2);
        System.out.println("original = " + original);

        List<MutablePerson> result = original.stream()
                .map(p -> {
                    p.setAge(p.getAge() + 1);
                    return p;
                })
                .toList();
        System.out.println("result = " + result);
        System.out.println("original = " + original);
    }
}
