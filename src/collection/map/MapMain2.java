package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("student1", 90);
//        System.out.println(studentMap);

        studentMap.put("student2", 100);
        System.out.println(studentMap);

        boolean containsKey = studentMap.containsKey("student1");
        System.out.println("containsKey = " + containsKey);

        studentMap.remove("student1");
        System.out.println(studentMap);
    }
}
