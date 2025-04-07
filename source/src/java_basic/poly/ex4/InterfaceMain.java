package java_basic.poly.ex4;

public class InterfaceMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Crow crow = new Crow();

        soundAnimal(cat);
        moveAnimal(cat);
        System.out.println("----");
        soundAnimal(dog);
        moveAnimal(dog);
        System.out.println("----");
        soundAnimal(crow);
        moveAnimal(crow);
        System.out.println("----");

        }
    private static void soundAnimal(InterfaceAnimal animal) {
        animal.sound();
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        animal.move();
    }
}
