package java_mid1.lang.immutable.address;

public class ImmutableAddress {
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
