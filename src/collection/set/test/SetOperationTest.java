package collection.set.test;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetOperationTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        //합집합
        Set<Integer> union = new HashSet<>();
        union.addAll(set1);
        union.addAll(set2);
        System.out.println(union);

        //교집합
        Set<Integer> intersection = new TreeSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        //차집합
        Set<Integer> different = new HashSet<>(set1);
        different.removeAll(set2);
        System.out.println(different);
    }
}
