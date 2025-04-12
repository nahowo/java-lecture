package java_mid2.generic.ex4;

import java_mid2.generic.animal.Cat;
import java_mid2.generic.animal.Dog;

import static java_mid2.generic.ex4.AnimalMethod.checkUp;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("점박이", 100);
        Cat cat = new Cat("나비", 150);

        AnimalMethod.<Dog>checkUp(dog); // <Dog> 생략가능
        checkUp(cat);

        Dog td = new Dog("큰멍멍이", 200);
        System.out.println("AnimalMethod.bigger(dog, td) = " + AnimalMethod.bigger(dog, td));
    }
}
