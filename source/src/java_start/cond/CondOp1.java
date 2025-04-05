package java_start.cond;

public class CondOp1 {
    public static void main(String[] args) {
        int age = 17;
        String status = age >= 18 ? "성인" : "미성년자";
        System.out.println("status = " + status);
        System.out.println(age >= 18 ? "18이상" : "18미만");
    }
}
