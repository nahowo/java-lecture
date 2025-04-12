package java_mid2.generic.ex3;

import java_mid2.generic.animal.Cat;
import java_mid2.generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
//        AnimalHospitalV3<Integer> integerHospital = new AnimalHospitalV3<>(); // Hospital과 관계없는 타입이 들어올 수 없음

        Dog dog = new Dog("점박이", 100);
        Cat cat = new Cat("나비", 150);

        dogHospital.setAnimal(dog);
        dogHospital.checkUp();

        catHospital.setAnimal(cat);
        catHospital.checkUp();

    }
}
