package java_mid1.lang.immutable.change;

public class MutableObj {
    private int value;

    public MutableObj(int value) {
        this.value = value;
    }

    public void add(int addValue) {
        value += addValue;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
