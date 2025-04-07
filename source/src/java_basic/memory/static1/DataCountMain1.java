package java_basic.memory.static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("data1.count = " + data1.count);
        Data1 data2 = new Data1("B"); // 각자 다른 count 변수를 사용함
        System.out.println("data2.count = " + data2.count);
    }
}
