package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //{1, 2, 5, 8, 14, 99}

        /*
        배열 선언
        먼저 배열의 이름을 buckets 즉 바구니들이라고 지었다. 배열 안에 단순히 값이 들어가 있는 것이아니라,
        해시 충돌을 고려해서 배열안에 배열이 들어가야한다. 그래야 해시 충돌이 발생했을때 여러 값을 담을 수 있다.
        여기서는 배열안에 배열 대산에 편리하게 사용할수 있는 연결 리스트를 사용했다.
        LinkedList는 하나의 바구니이다. 이런 바구니를 여러개 모아서 배열을 선언했다. 즉 배열안에 연결리스트가 들어있고, 연결리스트안에 데이터가 들어가는 구조이다.
         */
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        System.out.println("Arrays.toString(buckets) = " + Arrays.toString(buckets));
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
            System.out.println("Arrays.toString(buckets) = " + Arrays.toString(buckets)); //배열안에 링크드리스트가 들어있다. 한 배열안에 숫자를 여러개 넣기위해서
            add(buckets, 1);
            add(buckets, 2);
            add(buckets, 5);
            add(buckets, 8);
            add(buckets, 14);
            add(buckets, 99);
            add(buckets, 9); //중복
        System.out.println("Arrays.toString(buckets) = " + Arrays.toString(buckets));

        //검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("contains = " + contains);

    }

    /*
    데이터검색
    해시 언덱스로 배열의 인덱스르 찾는다. 여기에는 연결리스트가 들어있다.
    연결리스트의 buket.cotains(searchValue) 메서드를 사용해서 찾는 데이터가 있는지 확인한다.
     */
    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; //0(1)
        return bucket.contains(searchValue); //0(n) 해시충돌이 발생하지않으면 0(1)
    }

    /*
    데이터등록
    데이터를 등록할때 해시 인덱스(hashIndex)를 구한다.
    해시 인덱스로 배열의 인덱스를 찾는다. 배열에는 연결 리스트가 들어있다.
    셋은 중복된 값을 저장하지않는다. 따라서 바구니에 값을 저장하기전에 contain()를 사용해서 중복여부를 확인한다.
    만약 바구니에 같은 데이터가 없다면 데이터를 저장한다.
     */
    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; //0(1)
        if(!bucket.contains(value)){ //0(n)
            bucket.add(value);
        }
    }

    static int hashIndex(int value){
        return value % CAPACITY;
    }
}

