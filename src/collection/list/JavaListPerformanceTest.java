package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {
    public static void main(String[] args) {
        int size = 100_000;
        System.out.println("==MyArrayList 추가 ==");
        addFirst(new ArrayList<>(), size);
        addMid(new ArrayList<>(), size); //찾는데 0(1), 데이터추가(밀기)(n)

        ArrayList<Integer> arrayList = new ArrayList<>(); //조회용 데이터로 시용
        addLast(arrayList, size); //찾는데 0(1), 데이터 추가 0(1)

        int loop = 10000;
        System.out.println("==ArrayList 조회 ==");
        getIndex(arrayList, loop, 0); //앞에 조회
        getIndex(arrayList, loop, size / 2); //중간에서 조회시
        getIndex(arrayList, loop, size - 1); //마지막에서 조회시

        System.out.println("==ArrayList 검색 ==");
        search(arrayList, loop, 0); //맨앞에서 검색
        search(arrayList, loop, size / 2); //중간에서 검색
        search(arrayList, loop, size - 1); //마지막에서 검색


        System.out.println("==LinkedList 추가 ==");
        addFirst(new LinkedList<>(), size);
        addMid(new LinkedList<>(), size); //찾는데 0(n), 데이터추가(1)

        LinkedList<Integer> linkedList = new LinkedList<>();
        addLast(linkedList, size); //찾는데 0(n), 데이터 추가(1)

        System.out.println("==LinkedList 조회 ==");
        getIndex(linkedList, loop, 0); //앞에 조회
        getIndex(linkedList, loop, size / 2); //중간에서 조회시
        getIndex(linkedList, loop, size - 1); //마지막에서 조회시

        System.out.println("==LinkedList 검색 ==");
        search(linkedList, loop, 0); //맨앞에서 검색
        search(linkedList, loop, size / 2); //중간에서 검색
        search(linkedList, loop, size - 1); //마지막에서 검색


    }

    public static void addLast(List<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i/2, i);
        }

        long end = System.currentTimeMillis();

        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간" + (end - start) + "ms");
    }
    public static void addMid(List<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i/2, i);
        }

        long end = System.currentTimeMillis();

        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간" + (end - start) + "ms");
    }

    public static void addFirst(List<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }

        long end = System.currentTimeMillis();

        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간" + (end - start) + "ms");
    }

    private static void getIndex(List<Integer> list, int loop ,int index) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }

        long end = System.currentTimeMillis();
        System.out.println("index:" + index + ", 반복 " + loop + ", 계산시간; " + (end - start) + "ms");
    }

    private static void search(List<Integer> list, int loop ,int findValue) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }

        long end = System.currentTimeMillis();
        System.out.println("index:" + findValue + ", 반복 " + loop + ", 계산시간; " + (end - start) + "ms");
    }
}
