package java_adv3.stream.operation;

import java.util.Optional;

public class OptionalSimpleMain {
    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.of(10);
        if (o1.isPresent()) {
            Integer i = o1.get();
            System.out.println(i);
        }

        Optional<Object> o2 = Optional.ofNullable(null);
        System.out.println("o2 = " + o2);
        if (o2.isPresent()) {
            Object o = o2.get();
            System.out.println("o = " + o);
        }
    }
}
