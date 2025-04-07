package java_basic.poly.ex4;

public class Crow implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("깍깍");
    }

    @Override
    public void move() {
        System.out.println("까마귀 이동!");
    }
}
