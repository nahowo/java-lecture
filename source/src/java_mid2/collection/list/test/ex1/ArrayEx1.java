package java_mid2.collection.list.test.ex1;

import java.util.ArrayList;

public class ArrayEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(80);
        list.add(70);
        list.add(60);
        list.add(50);

        int total = 0;

        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        double avg = (double) total / list.size();
        System.out.println("total = " + total);
        System.out.println("avg = " + avg);
    }
}
