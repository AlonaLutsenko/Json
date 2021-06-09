package JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader("C:\\jsonfiles\\Json.json");

        Object obj = jsonParser.parse(reader);
        JSONObject jsonObject = (JSONObject)obj;

        JSONArray websites = (JSONArray)jsonObject.get("websites");
        System.out.println("Websites " + websites);
    }
}

