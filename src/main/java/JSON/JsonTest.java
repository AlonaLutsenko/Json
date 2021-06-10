package JSON;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.junit.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.junit.Test;

public class JsonTest {
    JsonObject jsonObject;
    @Before
    public void init() {
        FileReader reader = null;
        try {
            reader = new FileReader("src/main/java/JSON/Json.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();
        jsonObject = gson.fromJson(reader, JsonObject.class);
    }

    @After
    public void after() {
        jsonObject = null;

    }

    @Test
    public void positiveTest() {
        Object actual1 = jsonObject.get("websites");
        Assert.assertNotNull("This object should not be null", actual1);
    }

    @Test
    public void negativeTest() {
        Object actual2 = jsonObject.get("websites1");
        Assert.assertNull("This object should be null", actual2);
    }
@Test
    public void positiveTestAmazonBookCount(){
    JsonArray books = jsonObject.getAsJsonArray("websites");
        Assert.assertEquals(2, books.size());
    }
}
