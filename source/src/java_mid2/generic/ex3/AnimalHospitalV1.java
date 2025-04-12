package java_mid2.generic.ex3;

import java_mid2.generic.animal.Animal;

public class AnimalHospitalV1 {
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void checkUp() {
        System.out.println("동물 이름: " + animal.getName()); // Animal의 메서드이므로 사용 가능
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public Animal bigger(Animal target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
