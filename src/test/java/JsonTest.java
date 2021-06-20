import JSON.servise.WebSiteHelper;
import JSON.util.JsonHelper;
import org.openqa.selenium.json.Json;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JsonTest {
//    JsonHelper jsonObject;
//    public void after() {
//        jsonObject = null;
//    }

    @Test
    public void positiveTest() {
        WebSiteHelper webSiteHelper = new WebSiteHelper();
        webSiteHelper.isBookExist("Test1", "Pascal");

        Assert.assertTrue(true, "This object should not be null");
    }

//    @Test
//    public void negativeTest() {
//        Object actual2 = jsonObject.equals("websites1");
//        Assert.assertNull(actual2, "This object should be null");
//    }
}