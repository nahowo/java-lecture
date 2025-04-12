package java_mid2.generic.ex3;

import java_mid2.generic.animal.Cat;
import java_mid2.generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>(); // Hospital과 관계없는 타입이 들어올 수 있음

        Dog dog = new Dog("점박이", 100);
        Cat cat = new Cat("나비", 150);


    }
}
