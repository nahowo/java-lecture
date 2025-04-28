package java_adv3.optional;

import java.util.Optional;

public class OptionalRetrievalMain {
    public static void main(String[] args) {
        String java = "java";
        Optional<String> o1 = Optional.of("Hello");
        Optional<Object> o2 = Optional.empty();

        System.out.println(o1.isPresent());
        System.out.println(o1.isEmpty());
        System.out.println(o1.isPresent());

        System.out.println("o1.get() = " + o1.get());

        System.out.println("==NPE 방지==");
        System.out.println("o2.orElse = " + o2.orElse("기본값"));

        System.out.println("o2.orElseGet = " + o2.orElseGet(() -> "New value"));

        try {
            System.out.println(o2.orElseThrow(() -> new RuntimeException("값이 없습니다. ")));
        } catch (RuntimeException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }

        System.out.println("o2.or() = " + o2.or(() -> Optional.of("null value")));
    }
}
