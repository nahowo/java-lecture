package java_basic.memory.static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data3 = new Data3("A");
        System.out.println("count: " + Data3.count);
        Data3 data4 = new Data3("A");
        System.out.println("count: " + Data3.count);
        Data3 data5 = new Data3("A");
        System.out.println("count: " + Data3.count);
        System.out.println("count: " + data5.count);
    }
}
