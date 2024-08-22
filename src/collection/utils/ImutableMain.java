package collection.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImutableMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);

        ArrayList<Integer> mutableLsit = new ArrayList<>(list);
        mutableLsit.add(4);
        System.out.println(mutableLsit);

        Collection<Integer> unmodifiableCollection = Collections.unmodifiableCollection(mutableLsit);

        ArrayList<Integer> unmodifiableArrayList = new ArrayList<>(unmodifiableCollection);
        unmodifiableArrayList.add(5);
        System.out.println(unmodifiableArrayList);
    }
}
