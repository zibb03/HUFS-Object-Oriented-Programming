package 객체지향프로그래밍.test;

public class Book {
    String title;
    String author;

    Book(String title) {
        this(title, "작자미상");
    }
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void show() {
        System.out.println("제목: " + title + " 작가: " + author);
    }
}
