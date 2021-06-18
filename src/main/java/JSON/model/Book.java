package JSON.model;

import com.google.gson.JsonObject;

public class Book {
    private String author;
    private String bookTitle;

    public Book() {
    }

    public Book(JsonObject booksJson) {
        this.author = booksJson.get("author").toString();
        this.bookTitle = booksJson.get("bookTitle").toString();
    }

    public void Book(String author, String bookTitle) {
        this.author = author;
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

}
