package collection.utils;

import java.util.List;

public class OfMain {
    public static void main(String[] args) {
        //편리한 불변 컬렉션 생성
        List<Integer> list = List.of(1, 2, 3);

        System.out.println(list);
    }
}
