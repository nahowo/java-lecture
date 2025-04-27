package java_adv3.methodref;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodRefEx4 {
    public static void main(String[] args) {
        Person person1 = new Person("Park");
        Person person2 = new Person("Lee");
        Person person3 = new Person("Kim");
        List<Person> list = List.of(person1, person2, person3);

        List<String> result1 = mapPersonToString(list, Person::introduce);
        System.out.println("result1 = " + result1);

        List<String> result2 = mapStringToString(result1, String::toUpperCase); // s -> s.toUpperCase()
        System.out.println("result2 = " + result2);
    }

    static List<String> mapPersonToString(List<Person> list, Function<Person, String> func) {
        List<String> ret = new ArrayList<>();
        for (Person person : list) {
            ret.add(func.apply(person));
        }
        return ret;
    }

    static List<String> mapStringToString(List<String> list, Function<String, String> func) {
        List<String> ret = new ArrayList<>();
        for (String string : list) {
            ret.add(func.apply(string));
        }
        return ret;
    }
}
