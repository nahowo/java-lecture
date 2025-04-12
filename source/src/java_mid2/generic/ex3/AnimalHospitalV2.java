package java_mid2.generic.ex3;

public class AnimalHospitalV2<T> {
    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkUp() {
//        System.out.println("동물 이름: " + animal.getName()); // T 타입을 매서드 정의 시점에 알 수 없음, Object 메서드만 사용 가능
//        System.out.println("동물 크기: " + animal.getSize());
//        animal.sound();
        animal.toString();
    }

    public T bigger(T target) {
//        return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
