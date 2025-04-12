package java_mid2.generic.ex5;


import java_mid2.generic.animal.Animal;
import java_mid2.generic.animal.Cat;
import java_mid2.generic.animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        writeBox(animalBox); // Animal 이상 가능
        writeBox(objectBox);
//        writeBox(dogBox); // Animal 이하 불가능

        dogBox.setValue(new Dog("멍멍이", 100));
        catBox.setValue(new Cat("나비", 70));
    }

    static void writeBox(Box<? super Animal> box) {
        box.setValue(new Dog("멍멍이", 150));
    }
}
