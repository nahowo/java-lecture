package java_basic.poly.ex3;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        AbstractAnimal[] animals = new AbstractAnimal[]{new Dog(), new Cat(), new Crow()};

        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
            moveAnimal(animal);
            System.out.println("----");
        }
    }

    private static void soundAnimal(AbstractAnimal animal) {
        animal.sound();
    }

    private static void moveAnimal(AbstractAnimal animal) {
        animal.move();
    }
}
