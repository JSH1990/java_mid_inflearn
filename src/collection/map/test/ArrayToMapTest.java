package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Python", "20000"}, {"C++", "30000"} };

        //주어진 배열로 부터 Map 생성 - 코드 작성
        Map<String, Integer> productMap = new HashMap<>();
        for(String[] product : productArr){
            productMap.put(product[0], Integer.valueOf(product[1]));
            System.out.println(product[0]);
            System.out.println(product[1]);

        }

        for(String key : productMap.keySet()){
            System.out.println("제품: " + key + ", 가격: " + productMap.get(key));
        }
    }
}
