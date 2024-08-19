package collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Object> treeSet = new TreeSet<>();

        run(new HashSet<>());
        run(new LinkedHashSet<>());
        run(new TreeSet<>());
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("1");
        set.add("2");
        System.out.println("set = " + set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "");
        }
        System.out.println();
    }

}
