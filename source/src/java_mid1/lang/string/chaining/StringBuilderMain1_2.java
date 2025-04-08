package java_mid1.lang.string.chaining;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A").append("B").append("C").append("D").reverse().insert(2, "java").toString();

        System.out.println(sb);
    }
}
