package java_adv3.methodref;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        this("unknown");
    }

    public static String greeting() {
        return "hello";
    }

    public static String greeting(String name) {
        return "hello " + name;
    }

    public String getName() {
        return name;
    }

    public String introduce() {
        return "I am " + name;
    }

    public String introduce(int number) {
        return "I am " + name + ", my number is " + number;
    }
}
