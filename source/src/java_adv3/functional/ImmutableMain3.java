package java_adv3.functional;

import java.util.List;

public class ImmutableMain3 {
    public static void main(String[] args) {
        ImmutablePerson m1 = new ImmutablePerson("Lee", 30);
        ImmutablePerson m2 = new ImmutablePerson("Park", 24);
        List<ImmutablePerson> original = List.of(m1, m2);
        System.out.println("original = " + original);

        List<ImmutablePerson> result = original.stream()
                .map(p -> {
                    return p.withAge(p.getAge() + 1);
                })
                .toList();
        System.out.println("result = " + result);
        System.out.println("original = " + original);
    }
}
