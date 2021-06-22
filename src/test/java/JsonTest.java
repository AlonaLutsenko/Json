import JSON.model.Book;
import JSON.model.WebSite;
import JSON.servise.WebSiteHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class JsonTest {
    WebSiteHelper sites;

    @BeforeClass
    public void checkParser() {
        sites = new WebSiteHelper();
        try {
            sites.loadWebSites("src/main/java/JSON/resourse/Json.json");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() {
        WebSite secondSite = new WebSite();
        Book anotherBook = new Book("Test1", "Pascal");
        List<WebSite> anotherWebSites = sites.getWebSites();
        WebSite an = anotherWebSites.get(0);
        List<Book> n = an.getBooks();
        Book b = n.get(0);
        Assert.assertTrue(sites.getWebSites().get(0).getBooks().get(0).equals(anotherBook));
    }
}