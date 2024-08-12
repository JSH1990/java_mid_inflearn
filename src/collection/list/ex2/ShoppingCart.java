package collection.list.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();



    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        for (Item item : items) {
            System.out.println(item.getName() + "," + item.getTotalPrice());
        }
        System.out.println(getTotalPrice());
    }
    
    //getTotalPrice() 분리하기 전
//    int totalPrice = 0;
//        for (Item item : items) {
//        totalPrice += item.getTotalPrice();
//    }
//        System.out.println(totalPrice);

    private int getTotalPrice() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
