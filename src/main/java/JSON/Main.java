package JSON;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        String example = "{\n" +
                "\t\"websites\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"amazon\": {\n" +
                "\t\t\t\t\"id\": 1,\n" +
                "\t\t\t\t\"books\": [\n" +
                "\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t\"author\": \"Test1\",\n" +
                "\t\t\t\t\t\t\"bookTitle\": \"Pascal\"\n" +
                "\t\t\t\t\t},\n" +
                "\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t\"author\": \"Test2\",\n" +
                "\t\t\t\t\t\t\"bookTitle\": \"JS\"\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t]\n" +
                "\t\t\t}\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"rozetka\": {\n" +
                "\t\t\t\t\"id\": 2,\n" +
                "\t\t\t\t\"books\": [\n" +
                "\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t\"author\": \"Test3\",\n" +
                "\t\t\t\t\t\t\"bookTitle\": \"java\"\n" +
                "\t\t\t\t\t},\n" +
                "\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t\"author\": \"Test4\",\n" +
                "\t\t\t\t\t\t\"bookTitle\": \"Delphi\"\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t]\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}";

        StringBuilder key = new StringBuilder();
        StringBuilder value = new StringBuilder();
        boolean keyFlag = true;
        boolean valueFlag = false;
        for (char ch : example.toCharArray()) {
            if (ch == ':') {
                valueFlag = true;
                keyFlag = false;
            } else if (ch == '|') {
                keyFlag = true;
                valueFlag = false;
                map.put(key.toString(), Integer.valueOf(value.toString()));
                value = new StringBuilder();
                key = new StringBuilder();
            } else {
                if (keyFlag) {
                    key.append(ch);
                } else if (valueFlag) {
                    value.append(ch);
                }
            }
        }
        map.put(key.toString(), Integer.valueOf(value.toString()));
        System.out.println(map);
    }
}
