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
//    public static void main(String[] args) throws IOException, ParseException {
//        JSONParser jsonParser = new JSONParser();
//        FileReader reader = new FileReader("src/main/java/JSON/Json.json");
//
//        Object obj = jsonParser.parse(reader);
//        JSONObject jsonObject = (JSONObject) obj;
//
//        JSONArray websites = (JSONArray) jsonObject.get("websites");
//        System.out.println(websites);
//    }
//    public static void parseObject(JSONObject json, String key) {
//        System.out.println(json.containsKey(key));
//        System.out.println(json.get(key));
//    }
//    public static void getKey(JSONObject json, String key) {
//        Boolean exist = json.containsKey(key);
//        Iterator<?> keys;
//        String nextKeys;
//        if (!exist) {
//            keys = (Iterator<?>) json.keySet();
//            while (keys.hasNext()) {
//                nextKeys = (String) keys.next();
//                try {
//                    if (json.get(nextKeys) instanceof JSONObject) {
//                        if(exist == false){
//                            getKey((JSONObject) json.get(nextKeys), nextKeys);
//                        }
//                    } else if(json.get(nextKeys) instanceof JSONArray){
//
//                    }
//
//                } catch (Exception e) {
//               }
//           }
//       } else {
//           parseObject(json, key);
//       }
//   }
//    @Test
//    public void positiveTest() {
//        String actual1 = "";
//        String expectedResult = "Test1";
//        Assert.assertEquals(actual1, expectedResult);
//    }
//
//    @Test
//    public void negativeTest() {
//        String actual2 = "";
//        String expectedResult2 = "Test2";
//        Assert.assertNotEquals(actual2, expectedResult2);
//
//    }
}

