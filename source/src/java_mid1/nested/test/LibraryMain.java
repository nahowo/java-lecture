package java_mid1.nested.test;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library(4);
        library.addBook("b1", "a1");
        library.addBook("b2", "a2");
        library.addBook("b3", "a3");
        library.addBook("b4", "a4");
        library.addBook("b5", "a5");
        library.addBook("b6", "a6");
        library.showBooks();
    }
}
