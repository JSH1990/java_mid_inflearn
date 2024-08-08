package collection.array;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        int newValue = 3;
        andfirst(arr, newValue);
        System.out.println(Arrays.toString(arr));

        int index = 2;
        int value = 4;
        addAtIndex(arr, index, newValue);
        System.out.println(Arrays.toString(arr));
    }

    private static void addAtIndex(int[] arr, int index, int newValue) {
        for (int i = arr.length-1; i < index; i--) {
        arr[i] = arr[i -1];
    }
    arr[index] = newValue;
    }

    private static void andfirst(int[] arr, int newValue) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];

        }
        arr[0] = newValue;
    }
}
