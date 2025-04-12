package java_mid2.generic.test.ex3;


import java_mid2.generic.test.ex3.unit.BioUnit;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> t) {
        System.out.println("앉아있는 유기체: " + t.getUnit().getName() + ", hp: " + t.getUnit().getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> shuttle) {
        System.out.println("앉아있는 유기체: " + shuttle.getUnit().getName() + ", hp: " + shuttle.getUnit().getHp());
    }
}
