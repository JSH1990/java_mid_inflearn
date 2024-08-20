package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("studentA", 50);
        System.out.println(studentMap);

        //학생이 없는 경우에만 추가1
        if(!studentMap.containsKey("studentA")) {
            studentMap.put("studentA", 100);
        }
        System.out.println(studentMap);

        //학생이 없는 경우에만 추가2
        studentMap.putIfAbsent("studentA", 100); //studentA가 이미 있기때문에 100 안들어감
        studentMap.putIfAbsent("studentB", 100);
        System.out.println(studentMap);
    }
}
