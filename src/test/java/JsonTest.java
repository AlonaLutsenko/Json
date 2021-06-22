import JSON.model.Book;
import JSON.model.WebSite;
import JSON.servise.WebSiteHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class JsonTest {
    WebSiteHelper sites;
//    @BeforeClass
//    public void checkParser() throws Exception {
//        webSites = JsonHelper.makeJsonObject("src/main/java/JSON/resourse/Json.json");
//    }

    @Test
    public void test() {
        WebSite secondSite = new WebSite();
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Test1", "Pascal"));
        books.add(new Book("Test3", "Python"));
        secondSite.setId(1);
        secondSite.setBooks(books);
        Assert.assertFalse(sites.getWebSites().get(0).getValue().equals(secondSite));
    }

}