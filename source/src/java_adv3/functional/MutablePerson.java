package java_adv3.functional;

public class MutablePerson {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MutablePerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public MutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
