package java_adv3.optional;

import java.util.Optional;

public class OptinalCreationMain {
    public static void main(String[] args) {
        String s = "Hello Opt!";
        Optional<String> opt1 = Optional.of(s);
        System.out.println("opt1 = " + opt1);

        Optional<Object> opt2 = Optional.ofNullable(null);
        System.out.println("opt2 = " + opt2);

        Optional<String> opt3 = Optional.ofNullable(s);
        System.out.println("opt3 = " + opt3);

        Optional<Object> opt4 = Optional.empty();
        System.out.println("opt4 = " + opt4);


    }
}
