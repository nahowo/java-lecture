package method;

public class Method3 {
    public static void main(String[] args) {
        checkAge(17);
    }
    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println("미성년자는 출입 불가능합니다. ");
            return;
        }
        System.out.println("출입하세요. ");
    }
}
