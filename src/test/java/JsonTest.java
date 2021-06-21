import JSON.model.Book;
import JSON.model.WebSite;
import JSON.servise.WebSiteHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class JsonTest {
    WebSite webSite;

    @Test
    public void test() {
        Book expected = new Book("Test1", "Pascal");
        WebSiteHelper webSiteHelper = null;
        List<WebSite> book = webSiteHelper.getWebSites();
        WebSite webSites = book.get(0).getValue();
        Book actual = webSite.getBooks().get(1);
        Assert.assertTrue(expected.equals((actual)), "Message");
    }

}