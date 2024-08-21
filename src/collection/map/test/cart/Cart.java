package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private HashMap<Product, Integer> cartMap = new HashMap<>(); //Product 클래스가 키 값이다. 그래서 Product 클래스에 해시값 생성해줘야한다.

    public void add(Product product, int addQuantity) {
        Integer existingQuantity = cartMap.getOrDefault(product, 0); //상품이 없으면 수량을 0으로 표시
        cartMap.put(product, existingQuantity + addQuantity); //같은 상품이면 양을 추가
    }

    public void printAll() {;
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품 : " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }

    public void minus(Product product, int minQuantity) {
        int existingQuantity = cartMap.getOrDefault(product, 0);
        int newQuantity = existingQuantity - minQuantity;
        if(newQuantity <= 0) {
            cartMap.remove(product); //0보다 작으면 목록 삭제한다.
        }else {
            cartMap.put(product, newQuantity);
        }
    }
}
