package java_basic.poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal crow = new Crow();

        System.out.println("동물 시작");
        soundAnimal(dog); // 오버라이딩된 Dog의 sound()가 실행
        soundAnimal(cat); // 오버라이딩된 Cat의 sound()가 실행
        soundAnimal(crow); // 오버라이딩된 Crow의 sound()가 실행
    }

    private static void soundAnimal(Animal animal) {
        animal.sound();
    }
}
