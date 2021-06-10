package JSON;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Second {
//    @Test( dataProvider = "data" )
//    public void test(Object key, Object data)
//    {
//        System.out.println( "Key: " + key);
//        System.out.println( "Data: " + data );
//    }
//
//
//    @DataProvider( name = "data" )
//    public Object[][] getData()
//    {
//
//        JSONParser parser = new org.json.simple.parser.JSONParser();
//        Map<String, JSONObject> dataMap = new HashMap<String, JSONObject>();
//        Iterator entriesIterator = null;
//        try
//        {
//            JSONObject contentObj = (JSONObject)parser.parse(new FileReader(new File(System.getProperty("user.dir") + "src/main/java/JSON/Json.json")));
//            JSONObject dataObj = (JSONObject)contentObj.get("SuperParent");
//
//
//            dataObj.keySet().forEach(key -> {
//                dataMap.put(String.valueOf(key), (JSONObject) dataObj.get(key));
//            });
//
//            Set entries = dataObj.entrySet();
//            entriesIterator = entries.iterator();
//        } catch (FileNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (ParseException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//
//        Object[][] arr = new Object[dataMap.size()][2];
//        int i = 0;
//        while(entriesIterator.hasNext()){
//
//            Map.Entry mapping = (Map.Entry) entriesIterator.next();
//
//            arr[i][0] = mapping.getKey();
//            arr[i][1] = mapping.getValue();
//
//            i++;
//
//        }
//
//        return arr;
//    }
}
