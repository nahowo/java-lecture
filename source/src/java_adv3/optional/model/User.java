package java_adv3.optional.model;

public class User {
    private String name;
    private Address address;

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}
