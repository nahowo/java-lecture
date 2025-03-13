package cond.ex;

public class CondEx4 {
    public static void main(String[] args) {
        String m1 = "Monster";
        String m2 = "Arrival";
        String m3 = "Green Lantern";

        double rating = 6.7;
        System.out.println("평점 " + rating + "이상의 영화들을 추천해 드릴게요! ");
        if (rating <= 9.0) {
            System.out.println("'" + m1 + "'을 추천합니다. ");
        }
        if (rating <= 8.0) {
            System.out.println("'" + m2 + "'을 추천합니다. ");
        }
        if (rating <= 7.0) {
            System.out.println("'" + m3 + "'을 추천합니다. ");
        }
    }
}
