package java_basic.poly.ex5;

public class Crow extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("까악!");
    }

    @Override
    public void fly() {
        System.out.println("까마귀 날다");
    }
}
