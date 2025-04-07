package java_basic.extends1.ex;

public class ItemMain {
    public static void main(String[] args) {
        Book book = new Book("factfulness", 10000, "Hans Rosling", "12345");
        Album album = new Album("eternal sunshine", 4500, "ariana grande");
        Movie movie = new Movie("arrival", 31000, "Denis Villeneuve", "Amy Adams, Jeremy Renner");

        book.print();
        System.out.println("----");
        album.print();
        System.out.println("----");
        movie.print();
    }
}
