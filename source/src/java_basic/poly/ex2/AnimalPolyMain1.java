package java_basic.poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        AbstractAnimal[] animals = new AbstractAnimal[]{new Dog(), new Cat(), new Crow()};

        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
        }
        animals[0].move(); // AbstractAnimal의 move() 호출
    }

    private static void soundAnimal(AbstractAnimal animal) {
        animal.sound();
    }
}
