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
        sites.loadWebSites("src/main/java/JSON/resourse/Json.json");
    }

    @Test
    public void isBookExist() {
        Book actualBook = new Book("Test1", "Pascal");
        Assert.assertTrue(sites.getWebSites().get(0).getBooks().get(0).equals(actualBook));
    }

    @Test
    public void bookIsNotExist() {
        Book actualBook = new Book("Test5", "Python");
        Assert.assertFalse(sites.getWebSites().get(0).getBooks().get(0).equals(actualBook));
    }

}