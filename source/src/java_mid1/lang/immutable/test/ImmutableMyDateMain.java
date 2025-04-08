package java_mid1.lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2025, 4, 8);
        ImmutableMyDate date2 = date1;

        System.out.println("date1 = " + date1.toString());
        System.out.println("date2 = " + date2.toString());

        date2 = date2.setDate(2024, 1, 1);

        System.out.println("date1 = " + date1.toString());
        System.out.println("date2 = " + date2.toString());
    }
}
