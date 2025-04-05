package java_start.cond.ex;

public class CondEx5 {
    public static void main(String[] args) {
        String grade = "E";
        switch (grade) {
            case "A" -> System.out.println("탁월합니다!");
            case "B" -> System.out.println("수고했습니다.");
            case "C" -> System.out.println("흠...");
            case "D" -> System.out.println("무엇을 하신거죠?");
            case "F" -> System.out.println("돌아가.");
            default -> System.out.println("시스템 오류! 시스템 오류!");
        }
    }
}
