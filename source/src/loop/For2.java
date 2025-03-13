package loop;

public class For2 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("    j = " + j);
            }
            System.out.println();
        }
    }
}
