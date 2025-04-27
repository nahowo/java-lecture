package java_adv3.methodref;

import java.util.function.Function;

public class MethodRefEx3 {
    public static void main(String[] args) {
        Person person1 = new Person("Park");
        Person person2 = new Person("Lee");
        Person person3 = new Person("Kim");

        Function<Person, String> func1 = p -> p.introduce();
        System.out.println(func1.apply(person1));
        System.out.println(func1.apply(person2));
        System.out.println(func1.apply(person3));

        // 메서드 참조
        // 타입이 첫 번째 매개변수가 됨
        // 첫 번째 매개변수의 메서드 호출
        // 나머지 매개변수는 순서대로 매개변수에 전달
        Function<Person, String> func2 = Person::introduce; // 타입::인스턴스 메서드
        System.out.println(func2.apply(person1));
        System.out.println(func2.apply(person2));
        System.out.println(func2.apply(person3));

        TriFunction<Person, Integer, String> func3 = Person::introduce;
        System.out.println(func3.apply(person1, 3));
    }

    @FunctionalInterface
    interface TriFunction<T1, T2, R> {
        R apply(T1 t1, T2 t2);
    }
}
