package java_mid2.generic.animal;

public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("야옹");
    }

    public Cat(String name, int size) {
        super(name, size);
    }
}
