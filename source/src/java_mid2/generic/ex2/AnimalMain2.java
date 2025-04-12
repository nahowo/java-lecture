package java_mid2.generic.ex2;

import java_mid2.generic.animal.Animal;
import java_mid2.generic.animal.Cat;
import java_mid2.generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);

        Box<Animal> animalBox = new Box<>();
        animalBox.setValue(animal);
        animalBox.setValue(dog); // 하위 타입도 들어갈 수 있음

        Animal findAnimal = animalBox.getValue();
        findAnimal.sound();
    }
}
