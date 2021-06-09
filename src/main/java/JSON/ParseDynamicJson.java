package JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import org.testng.Assert;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class ParseDynamicJson {
    public static void parseObject(JSONObject json, String key) {
        System.out.println(json.containsKey(key));
        System.out.println(json.get(key));
    }

    public static void getKey(JSONObject json, String key) {
        Boolean exist = json.containsKey(key);
        Iterator<?> keys;
        String nextKeys;
        if (!exist) {
            keys = (Iterator<?>) json.keySet();
            while (keys.hasNext()) {
                nextKeys = (String) keys.next();
                try {
                    if (json.get(nextKeys) instanceof JSONObject) {
                        if(exist == false){
                            getKey((JSONObject) json.get(nextKeys), nextKeys);
                        }
                    } else if(json.get(nextKeys) instanceof JSONArray){

                    }

                } catch (Exception e) {

                }
            }
        } else {
            parseObject(json, key);
        }
    }

}
