package JSON.servise;

import JSON.util.JsonHelper;
import JSON.model.Book;
import JSON.model.WebSite;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static JSON.util.JsonHelper.*;

public class WebSiteHelper {
    private static final String ID = "id";
    private static final String BOOKS = "books";
    private static final String AUTHOR = "author";
    private static final String TITLE = "bookTitle";
    private static final String WEB_SITES = "websites";

    private List<WebSite> webSites;

    public List<WebSite> getWebSites() {
        return webSites;
    }

    public List<WebSite> loadWebSites(String filePath) throws Exception {
        JsonObject resource = getJsonResource(filePath);
        JsonArray websites = getArray(resource, WEB_SITES);
        List<WebSite> response = new ArrayList<>();
        for (JsonElement element : websites) {
            for (Map.Entry entry : element.getAsJsonObject().entrySet()) {
                String name = (String) entry.getKey();
                JsonObject site = (JsonObject) entry.getValue();
                WebSite webSite = makeWebSite(name, site);
                response.add(webSite);
            }
        }
        this.webSites = response;
        return response;
    }

    private JsonObject getJsonResource(String filePath) throws Exception{
        return JsonHelper.makeJsonObject(filePath);
    }

    private WebSite makeWebSite(String name, JsonObject object) {
        WebSite site = new WebSite();
        site.setName(name);
        site.setId(getIntValue(object, ID));
        List<Book> books = loadBooks(getArray(object, BOOKS));
        site.setBooks(books);
        return site;
    }

    private List<Book> loadBooks(JsonArray booksArray) {
        List<Book> books = new ArrayList<>();
        for (JsonElement item : booksArray) {
            Book book = makeBook(item.getAsJsonObject());
            books.add(book);
        }
        return books;
    }

    private Book makeBook(JsonObject object) {
        Book book = new Book();
        book.setAuthor(getValue(object, AUTHOR));
        book.setBookTitle(getValue(object, TITLE));
        return book;
    }

    public Boolean isBookExist(String author, String title) {
        for(WebSite site: webSites){
            Boolean existBook = null;
            try {
                existBook = site.isBookExist(author, title);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if(existBook){
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
