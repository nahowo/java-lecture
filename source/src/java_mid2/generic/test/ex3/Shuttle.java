package java_mid2.generic.test.ex3;

import java_mid2.generic.test.ex3.unit.BioUnit;

public class Shuttle<T extends BioUnit> {
    private T unit;
    public void in(T t) {
        unit = t;
    }

    public T getUnit() {
        return unit;
    }

    public void showInfo() {
        System.out.println("앉아있는 유기체: " + unit.getName());
    }
}
