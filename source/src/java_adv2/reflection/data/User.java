package java_adv2.reflection.data;

public class User {
    private String id;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", nage='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public User(String id, String nage, Integer age) {
        this.id = id;
        this.name = nage;
        this.age = age;
    }

    public User() {
    }
}
