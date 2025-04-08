package java_mid1.lang.immutable.address;

public class MemberV1 {
    private String name;
    private Address address;

    public MemberV1(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
