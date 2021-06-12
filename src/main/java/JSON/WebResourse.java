package JSON;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;

public class WebResourse {
    private Map<String, WebSites> webresourse;

    public Map<String, WebSites> getWebresourse() {
        return webresourse;
    }

    public void setWebresourse(Map<String, WebSites> webresourse) {
        this.webresourse = webresourse;
    }

    public WebResourse(JsonObject webResoursesObj) {
        webresourse = new HashMap<>();
        for (Map.Entry entry : webResoursesObj.getAsJsonObject().entrySet()) {
                webresourse.put((String) entry.getKey(), new WebSites((JsonArray) entry.getValue()));
            }
    }

    public
}
