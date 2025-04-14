package java_mid2.collection.compare;

public class MyUser implements Comparable<MyUser>{
    private String id;
    private int age;

    @Override
    public String toString() {
        return "MyUser{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    public MyUser(String id, int age) {
        this.id = id;
        this.age = age;
    }

    @Override
    public int compareTo(MyUser o) {
        return this.age < o.age ? -1 : (this.age == o.age ? 0 : 1);
    }

    public String getId() {
        return id;
    }
}
