package java_adv3.functional;

public class ImmutablePerson {
    private final String name;
    private final int age;

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public ImmutablePerson withAge(int newAge) {
        return new ImmutablePerson(name, newAge);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
