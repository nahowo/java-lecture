package java_mid2.generic.ex5;


import java_mid2.generic.animal.Cat;
import java_mid2.generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.setValue(new Dog("멍멍이", 100));
        catBox.setValue(new Cat("나비", 70));
        WildcardEx.<Dog>printGenericV1(dogBox); // 타입 명시 이후 catBox를 넣으면 컴파일 오류
        WildcardEx.printGenericV1(catBox); // 타입 추론 없이는 Animal 이하 전부 가능

        WildcardEx.printGenericV2(catBox);
        WildcardEx.printAndReturnGeneric(dogBox);
        System.out.println("---");

        WildcardEx.printWildcardV1(dogBox);
        WildcardEx.printWildcardV2(dogBox);
        WildcardEx.printAndReturnWildcard(dogBox);
    }
}
