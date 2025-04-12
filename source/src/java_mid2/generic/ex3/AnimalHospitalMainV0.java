package java_mid2.generic.ex3;

import java_mid2.generic.animal.Cat;
import java_mid2.generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("점박이", 100);
        Cat cat = new Cat("나비", 150);

        dogHospital.setAnimal(dog);
        dogHospital.checkUp();

        catHospital.setAnimal(cat);
        catHospital.checkUp();


        Dog dog2 = dogHospital.bigger(new Dog("멍멍이", 200));
        System.out.println("dog2 = " + dog2);
    }
}
