package JSON;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

public class Site {
    private int id;
    private List<Book> books;

    public Site(int id, List<Book> books) {
        this.id = id;
        this.books = books;
    }

    public Site(JsonObject siteObject) {
        this.id = Integer.parseInt(siteObject.get("id").toString());
        JsonArray booksJson = siteObject.get("books").getAsJsonArray();
        books = new ArrayList<Book>();
        for (JsonElement jsonElement : booksJson) {
            books.add(new Book(jsonElement.getAsJsonObject()));

        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public boolean isBookOnSite() {
        // go through books and
    }
}
