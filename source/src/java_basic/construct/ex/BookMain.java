package java_basic.construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book("Lord of the Rings", "J.R.R Tolkien", 902);
        Book b2 = new Book("Harry Potter", "J.K Rowling");

        b1.displayInfo();
        b2.displayInfo();
    }
}
