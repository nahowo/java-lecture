package java_start.casting;

public class Casting1 {
    public static void main(String[] args) {
        int i = 10;
        long l;
        double d;

        l = (long) i;
        System.out.println("l = " + l);
        d = i;
        System.out.println("d = " + d);

        double d2 = 20L;
        System.out.println("d2 = " + d2);
    }
}
