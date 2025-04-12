package java_mid2.generic.ex4;

import java_mid2.generic.animal.Cat;
import java_mid2.generic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("점박이", 100);
        Cat cat = new Cat("나비", 150);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.setAnimal(dog);

        Cat returnCat = hospital.<Cat>printAndReturn(cat); // 제네릭 메서드가 우선순위를 가진다.
        System.out.println("returnCat = " + returnCat);
    }
}
