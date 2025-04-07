package java_basic.poly.ex1;

public class AnimalPolyMain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal crow = new Crow();
        Animal cat1 = new Cat();
        Animal[] animals = new Animal[]{dog, cat, crow, cat1};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        animal.sound();
    }
}
