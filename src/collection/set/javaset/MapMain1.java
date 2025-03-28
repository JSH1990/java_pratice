package collection.set.javaset;

import java.util.HashMap;
import java.util.Set;

public class MapMain1 {

    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();
        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);
        System.out.println(studentMap);

        Integer result = studentMap.get("studentD");
        System.out.println("result = " + result);

        Set<String> keySet = studentMap.keySet();
        for (String key : keySet) {
            studentMap.get(key);
        }
    }
}
