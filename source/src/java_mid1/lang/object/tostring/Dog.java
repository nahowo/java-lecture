package java_mid1.lang.object.tostring;

public class Dog {

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sound() {
        System.out.println("멍멍!");
    }

    @Override
    public String toString() {
        return "dogname: " + name + ", age: " + age;
    }
}
