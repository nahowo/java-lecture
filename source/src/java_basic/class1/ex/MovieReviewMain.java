package java_basic.class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview mr1 = new MovieReview();
        MovieReview mr2 = new MovieReview();

        mr1.title = "에일리언";
        mr1.review = "에일리언이 징그러워요";

        mr2.title = "에일리언2";
        mr2.review = "good";

        MovieReview[] mrs = new MovieReview[]{mr1, mr2};

        for (MovieReview mr : mrs) {
            System.out.println("title: " + mr.title + ", review: " + mr.review);
        }
    }
}
