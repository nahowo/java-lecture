package java_basic.final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
//        data = new Data(); // 컴파일 오류

        data.value = 10;
        System.out.println("data.value = " + data.value);
        data.value = 20; // 재할당 가능
        System.out.println("data.value = " + data.value);
    }
}
