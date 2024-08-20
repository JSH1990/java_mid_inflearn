package collection.map;

import java.util.*;

public class MapMain1 {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put(1, "90");
        studentMap.put(2, "80");
        studentMap.put(3, "70");
        studentMap.put(4, "60");

        System.out.println("studentMap = " + studentMap);

        //특정 학생의 값 조회
        System.out.println("keySet의 활용");
        Set<Integer> keySet = studentMap.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " = " + studentMap.get(key));
        }

        System.out.println();

        System.out.println("values의 활용");
        Collection<String> values = studentMap.values();
        for (String value : values) {
            System.out.println(value);
        }

        System.out.println("entrySet 활용");
        Set<Map.Entry<Integer, String>> entries = studentMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }


}
