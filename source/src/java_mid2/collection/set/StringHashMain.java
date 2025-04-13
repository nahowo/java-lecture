package java_mid2.collection.set;

public class StringHashMain {
    static final int CAPACITY = 10;
    public static void main(String[] args) {
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode('AB') = " + hashCode("AB"));

        System.out.println(hashIndex(hashCode("A")));
        System.out.println(hashIndex(hashCode("B")));
        System.out.println(hashIndex(hashCode("AB")));
    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
