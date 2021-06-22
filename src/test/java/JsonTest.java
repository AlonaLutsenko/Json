import JSON.model.Book;
import JSON.servise.WebSiteResource;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JsonTest {
    WebSiteResource sites;

    @BeforeClass
    public void checkParser() {
        sites = new WebSiteResource();
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