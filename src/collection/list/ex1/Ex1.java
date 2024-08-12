package collection.list.ex1;

public class Ex1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70 ,60 ,50};

        int total = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }

        double average = (double) total / students.length;
        System.out.println("total = " + total);
        System.out.println("average = " + average);


    }
}
