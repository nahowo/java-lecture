package java_mid2.generic.ex3;

import java_mid2.generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> { // Animal과 그 자식들만 타입 인자로 들어올 수 있도록 제한
    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkUp() {
        System.out.println("동물 이름: " + animal.getName()); // T 타입을 Animal과 그 자식으로 제한했기 때문에 Animal의 메서드 사용 가능
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
