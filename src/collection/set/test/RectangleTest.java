package collection.set.test;

import java.util.HashSet;

public class RectangleTest {
    public static void main(String[] args) {
        HashSet<Rectangle> retangleSet = new HashSet<>();
        retangleSet.add(new Rectangle(10,10));
        retangleSet.add(new Rectangle(20,20));
        retangleSet.add(new Rectangle(20,20));

        for (Rectangle rectangle : retangleSet) {
            System.out.println(rectangle);
        }
    }
}
