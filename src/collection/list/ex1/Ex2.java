package collection.list.ex1;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> students = new ArrayList<>();

        students.add(90);
        students.add(80);
        students.add(70);
        students.add(60);

        int total = 0;
        for (int i = 0; i < students.size(); i++) {
            total += students.get(i);
        }

        double average = (double) total / students.size();
        System.out.println("total = " + total);
        System.out.println("average = " + average);


    }
}