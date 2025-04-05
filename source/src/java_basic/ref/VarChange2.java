package java_basic.ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data data1 = new Data();
        Data data2 = data1;
        data1.value = 10;

        System.out.println("data1 = " + data1.value);
        System.out.println("data2 = " + data2.value);

        data1.value = 20;

        System.out.println("data1 = " + data1.value);
        System.out.println("data2 = " + data2.value);

        data2.value = 30;

        System.out.println("data1 = " + data1.value);
        System.out.println("data2 = " + data2.value);

    }
}
