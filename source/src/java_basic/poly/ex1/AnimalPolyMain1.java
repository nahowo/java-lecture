package java_basic.poly.ex1;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Dog(), new Cat(), new Crow()};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        animal.sound();
    }
}
