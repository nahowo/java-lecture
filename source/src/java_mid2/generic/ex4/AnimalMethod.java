package java_mid2.generic.ex4;

import java_mid2.generic.animal.Animal;

public class AnimalMethod {
    public static <T extends Animal> void checkUp(T t) {
        System.out.println("동물 이름: " + t.getName()); // T 타입을 Animal과 그 자식으로 제한했기 때문에 Animal의 메서드 사용 가능
        System.out.println("동물 크기: " + t.getSize());
        t.sound();
    }

    public static <T extends Animal> T bigger(T t1, T target) {
        return t1.getSize() > target.getSize() ? t1 : target;
    }
}
