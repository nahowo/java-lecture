package java_adv3.lambda.ex1;

public class M2After {
    public static void main(String[] args) {
        print(40, "kg");
        print(10, "g");
    }

    static void print(int w, String unit) {
        System.out.println("무게: " + w + unit);
    }
}