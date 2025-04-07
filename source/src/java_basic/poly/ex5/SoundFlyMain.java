package java_basic.poly.ex5;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Crow crow = new Crow();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
//        flyAnimal(dog); // Fly를 상속(구현)하지 않으므로 컴파일 오류
        System.out.println("----");

        soundAnimal(crow);
        flyAnimal(crow);
        System.out.println("----");

        soundAnimal(dog);
        flyAnimal(chicken);
        System.out.println("----");
    }

    private static void soundAnimal(AbstractAnimal animal) {
        animal.sound();
    }

    private static void flyAnimal(Fly animal) {
        animal.fly();
    }
}
