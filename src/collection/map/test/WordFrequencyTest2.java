package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest2 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        Map<String, Integer> map = new HashMap<>();
        String[] words = text.split(" "); //단어사이의 빈칸을 기준으로 단어들은 나눈다.


        for (String word : words) {
//            Integer count = map.get(word);
//            if (count == null) {
//                count = 0;
//            }
//            count++;

            map.put(word, map.getOrDefault(word, 0) +1);
        }
        System.out.println(map);
    }
}
