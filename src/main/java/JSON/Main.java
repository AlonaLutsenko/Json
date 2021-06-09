package JSON;

import bsh.CallStack;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import org.openqa.selenium.json.JsonException;
import org.testng.Assert;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader("src/main/java/JSON/Json.json");

        Object obj = jsonParser.parse(reader);
        JSONObject jsonObject = (JSONObject) obj;

        JSONArray websites = (JSONArray) jsonObject.get("websites");
        System.out.println(websites);
    }
}

