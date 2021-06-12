package JSON;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonHelper {
    public static void main(String[] args) {
        ConvertJson convertJson = new ConvertJson("src/main/java/JSON/Json.json");
        WebResourse  convertedJson = convertJson.readAndParseJson();
        boolean isBookFound = convertedJson.isBookExist(author, title)
    }
}
