package java_mid1.nested.test;

public class Library {
    private int maxCount;
    private int cnt = 0;
    private Book[] books;

    class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        void showBook(Book book) {
            System.out.println("도서 제목: " + book.title + ", 저자: " + book.author);
        }
    }

    public void addBook(String title, String author) {
        if (cnt >= maxCount) {
            System.out.println("책장이 가득 찼습니다. 꽂지 못한 책: " + title);
            return;
        }
        books[cnt ++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < cnt; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
        }
    }

    public Library(int maxCount) {
        this.maxCount = maxCount;
        books = new Book[maxCount];
    }
}
