package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmptyListMain {
    public static void main(String[] args) {
        //빈 가변 리스트 생성
        ArrayList<Integer> list1 = new ArrayList<>();

        List<Object> list3 = Collections.emptyList();
        List<Object> list4 = List.of();
        System.out.println("list3 = " + list3.getClass());
        System.out.println("list4 = " + list4.getClass());
    }
}
