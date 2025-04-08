package java_mid1.lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("A");
        sb.append("A");
        sb.append("A");
        sb.append("A");
        System.out.println(sb);

        sb.insert(3, "Java");
        System.out.println(sb);

        sb.delete(1, 4);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.toString();
        System.out.println(sb);
    }
}
