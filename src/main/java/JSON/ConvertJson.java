package JSON;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ConvertJson {
    private String filePath;

    public ConvertJson(String filePath) {
        this.filePath = filePath;
    }

    public WebResourse readAndParseJson() {
        JsonObject jsonObject;
        FileReader reader = null;
        try {
            reader = new FileReader(this.filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();
        jsonObject = gson.fromJson(reader, JsonObject.class);
        WebResourse webResourse = new WebResourse(jsonObject);
        return webResourse;
    }
}
