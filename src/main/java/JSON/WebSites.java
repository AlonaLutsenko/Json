package JSON;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebSites {
    @JsonProperty("websites")
    List<Map<String, Site>> websites;

    public WebSites() {
    }

    public WebSites(JsonArray webResoursesJson) {
        websites = new ArrayList<Map<String, Site>>();
        for (JsonElement element : webResoursesJson) {
            Map<String, Site> site = new HashMap<>();
            for (Map.Entry entry : element.getAsJsonObject().entrySet()) {
                site.put((String) entry.getKey(), new Site((JsonObject) entry.getValue()));
            }
            websites.add(site);
        }
    }

    public List<Map<String, Site>> getWebsites() {
        return websites;
    }

    public void setWebsites(List<Map<String, Site>> websites) {
        this.websites = websites;
    }

    public boolean isBookOnSites {
        //
    }
}
