package JSON.model;

import java.util.ArrayList;
import java.util.List;

public class WebSite {
    private Integer id;
    private String name;
    private List<Book> books;

    public WebSite() {
        this.books = new ArrayList<>();
    }

    public WebSite(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.books = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        if (this.books == null) {
            this.books = new ArrayList<>();
        }
        this.books.add(book);
    }

    //    public boolean isBookExist(String author, String title) throws Exception {
//        if (author == null) {
//            throw new Exception("Invalid author");
//        }
//        if (title == null) {
//            throw new Exception("Invalid title");
//        }
//
//        for (Book book : this.books) {
//            Boolean existAuthor = equals(author, book.getAuthor());
//            Boolean existTitle = equals(title, book.getBookTitle());
//            if (existAuthor && existTitle) {
//                return Boolean.TRUE;
//            }
//        }
//
//        return Boolean.FALSE;
//    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WebSite anotherWebsite = (WebSite) o;
        if (this.hashCode() != anotherWebsite.hashCode()) return false;
        if (this.getId() == anotherWebsite.getId() && this.books.size() == anotherWebsite.getBooks().size()) {
            for (int i = 0; i < this.getBooks().size(); i++) {
                if (this.books.get(i).equals(anotherWebsite.getBooks().get(i)) == false) return false;
            }
            return true;
        } else return false;
    }

    @Override
    public int hashCode() {
        int result = id;
        for (Book book : books) {
            result = 37 * result + book.hashCode();
        }
        return result;
    }
}
