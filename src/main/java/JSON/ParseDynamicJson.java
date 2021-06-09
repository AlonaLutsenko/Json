package JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class ParseDynamicJson {
    public static void parseObject(JSONObject json, String key){
        System.out.println(json.containsKey(key));
        System.out.println(json.get(key));

    }
    public static void getKey(JSONObject json, String key) {
        Boolean exist = json.containsKey(key);
        if(!exist){

        } else{
            parseObject(json, key);
        }
    }

    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader("src/main/java/JSON/Json.json");

        Object obj = jsonParser.parse(reader);
        JSONObject jsonObject = (JSONObject) obj;

        JSONArray websites = (JSONArray) jsonObject.get("websites");
        JSONObject inputJsonObject = new JSONObject(jsonObject);
        getKey(jsonObject, "websites");

    }
}
