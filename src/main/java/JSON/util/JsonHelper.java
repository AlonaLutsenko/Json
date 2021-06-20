package JSON.util;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class JsonHelper {
    public JsonHelper() throws Exception {
        throw new Exception("Helper class");
    }

    public static JsonObject makeJsonObject(String filePath) throws Exception {
        try {
            FileReader reader = new FileReader(filePath);
            Gson gson = new Gson();
            return gson.fromJson(reader, JsonObject.class);
        } catch (FileNotFoundException e) {
            throw new Exception("File Not found", e);
        }
    }

    public static String getValue(JsonObject object, String property) {
        return object.get(property).getAsString();
    }

    public static Integer getIntValue(JsonObject object, String property) {
        return object.get(property).getAsInt();
    }

    public static JsonArray getArray(JsonObject object, String property) {
        return object.get(property).getAsJsonArray();
    }
}
