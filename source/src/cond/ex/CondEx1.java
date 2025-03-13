package cond.ex;

public class CondEx1 {
    public static void main(String[] args) {
        int score = 75;
        String level;
        if (score >= 90) {
            level = "A";
        } else if (score >= 80) {
            level = "B";
        } else if (score >= 70) {
            level = "C";
        }
        else {
            level = "F";
        }
        System.out.println("level = " + level);
    }
}
