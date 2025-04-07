package java_basic.poly.ex3;

public class Crow extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("까악!");
    }

    @Override
    public void move() {
        System.out.println("까마귀가 이동한다!");
    }
}
