package java_mid2.generic.ex3;

import java_mid2.generic.animal.Animal;
import java_mid2.generic.animal.Cat;
import java_mid2.generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 animalHospital = new AnimalHospitalV1();

        Dog dog = new Dog("점박이", 100);
        Cat cat = new Cat("나비", 150);

        animalHospital.setAnimal(dog);
        animalHospital.checkUp();

        animalHospital.setAnimal(cat); // 개 병원에 고양이 전달
        animalHospital.checkUp();

        Dog bigger = (Dog) animalHospital.bigger(dog); // 반환 타입이 Dog, 다운캐스팅 필요
        Cat bigger1 = (Cat) animalHospital.bigger(dog); // 반환 타입이 Cat, 캐스팅 불가능
        System.out.println("bigger = " + bigger);
    }
}
