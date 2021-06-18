import JSON.util.JsonHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JsonTest {
    JsonHelper jsonObject;
    public void after() {
        jsonObject = null;
    }

    @Test
    public void positiveTest() {
        Object actual1 = jsonObject.equals("websites");
        Assert.assertNotNull(actual1, "This object should not be null");
    }

    @Test
    public void negativeTest() {
        Object actual2 = jsonObject.equals("websites1");
        Assert.assertNull(actual2, "This object should be null");
    }
}