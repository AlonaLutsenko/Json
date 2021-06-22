import JSON.model.Book;
import JSON.model.WebSite;
import JSON.servise.WebSiteHelper;
import JSON.util.JsonHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class JsonTest {
    WebSiteHelper webSites;
//    @BeforeClass
//    public void checkParser() throws Exception {
//        webSites = JsonHelper.makeJsonObject("src/main/java/JSON/resourse/Json.json");
//    }

    @Test
    public void test() {
        WebSite another = new WebSite();
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Test1", "Pascal"));
        books.add(new Book("Test3", "Python"));
        another.setId(1);
        another.setBooks(books);
        Assert.assertFalse(webSites.getWebSites().get(0).getValue().equals(another));
    }

}