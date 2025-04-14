package java_mid2.collection.compare;

import java.util.Arrays;

public class SortMain3 {
    public static void main(String[] args) {
        MyUser u1 = new MyUser("a", 30);
        MyUser u2 = new MyUser("b", 10);
        MyUser u3 = new MyUser("c", 20);

        MyUser[] array = {u1, u2, u3};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


        Arrays.sort(array, new IdComparator().reversed());
        System.out.println(Arrays.toString(array));
    }
}
