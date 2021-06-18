package JSON;

import JSON.servise.WebSiteHelper;

public class ApplicationMain {
    public static void main(String[] args) throws Exception {
        String filePath = "src/main/java/JSON/Json.json";
        WebSiteHelper service = new WebSiteHelper();

        service.loadWebSites(filePath);
        service.printAll();
    }
}
