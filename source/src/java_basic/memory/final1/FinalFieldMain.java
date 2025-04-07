package java_basic.memory.final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        System.out.println("생성자 초기화");
        ConstructInit constructInit = new ConstructInit(10);
        ConstructInit constructInit1 = new ConstructInit(20);

        System.out.println("constructInit.value = " + constructInit.value);
        System.out.println("constructInit1.value = " + constructInit1.value);
    }
}
