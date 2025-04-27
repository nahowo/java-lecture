package java_adv3.methodref;

import java.util.function.Supplier;

public class MethodRefEx1 {
    public static void main(String[] args) {
        Supplier<String> staticMethod1 = Person::greeting;
        System.out.println(staticMethod1.get());

        Person person = new Person("Park");
        Supplier<String> instanceMethod1 = person::introduce;
        System.out.println(instanceMethod1.get());

        Supplier<Person> newPerson = Person::new;
        System.out.println(newPerson.get());
    }
}
