package java_adv3.methodref;

import java_adv3.lambda.lambda5.mystream.MyStreamV3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodRefEx5 {
    public static void main(String[] args) {
        Person person1 = new Person("Park");
        Person person2 = new Person("Lee");
        Person person3 = new Person("Kim");
        List<Person> list = List.of(person1, person2, person3);

        List<String> result1 = MyStreamV3.of(list)
                .map(Person::introduce)
                .map(String::toUpperCase)
                .toList();
        System.out.println("result1 = " + result1);
    }
}
