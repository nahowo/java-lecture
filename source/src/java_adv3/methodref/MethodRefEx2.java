package java_adv3.methodref;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefEx2 {
    public static void main(String[] args) {
        Function<String, String> staticMethod1 = Person::greeting;
        System.out.println(staticMethod1.apply("Lee"));

        Person person = new Person("Park");
        Function<Integer, String> instanceMethod1 = person::introduce;
        System.out.println(instanceMethod1.apply(3));

        Function<String, Person> newPerson = Person::new;
        System.out.println(newPerson.apply("Kim").getName());
    }
}
