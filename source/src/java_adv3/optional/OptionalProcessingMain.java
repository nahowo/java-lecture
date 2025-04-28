package java_adv3.optional;

import java.util.Optional;

public class OptionalProcessingMain {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("hello");
        Optional<String> o2 = Optional.empty();

        o1.ifPresent(v -> System.out.println("value: " + v));

        o2.ifPresentOrElse(v -> System.out.println("value: " + v),
                () -> System.out.println("empty"));

        System.out.println("o1.map(String::length) = " + o1.map(String::length));
        System.out.println("o2.map(String::length) = " + o2.map(String::length));

        Optional<Optional<String>> nested = o1.map(s -> Optional.of(s));
        System.out.println("nested = " + nested);

        Optional<String> flattened = o1.flatMap(s -> Optional.of(s));
        System.out.println("flattened = " + flattened);


        System.out.println(o1.filter(i -> i.startsWith("h")));
        System.out.println(o2.filter(i -> i.startsWith("h")));

        o1.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();
        o2.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();
    }
}
