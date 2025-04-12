package java_mid2.generic.test.ex1;

public class ContainerTest {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>();
        System.out.println("빈값 확인: " + stringContainer.isEmpty());
        stringContainer.setItem("hello");
        System.out.println("data: " + stringContainer.getItem());
        System.out.println("빈값 확인: " + stringContainer.isEmpty());
        stringContainer.setItem("java");
        System.out.println("data: " + stringContainer.getItem());

        Container<Integer> integerContainer = new Container<>();
        System.out.println("빈값 확인: " + integerContainer.isEmpty());
        integerContainer.setItem(10);
        System.out.println("data: " + integerContainer.getItem());
        integerContainer.setItem(20);
        System.out.println("data: " + integerContainer.getItem());
    }
}
