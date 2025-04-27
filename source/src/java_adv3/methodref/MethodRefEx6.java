package java_adv3.methodref;

import java.util.function.BiFunction;

public class MethodRefEx6 {
    public static void main(String[] args) {
        Person person1 = new Person("Park");

        BiFunction<Person, Integer, String> func1 = Person::introduce;
        System.out.println(func1.apply(person1, 3));

    }
}
