package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {
    //기본 생성자를 사용하면 16이 사용된다.
    static final int DEFALUT_INITIAL_CAPACITY = 16;

    /*
     연결리스트를 여러개 만든 배열생성
     -배열안에 연결 리스트가 들어있고, 연결리스트안에 데이터가 저장된다.
     -해시 인덱스가 충돌이 발생하면 같은 연결리스트안에 여러 데이터가 저장된다.
     */
    LinkedList<Integer>[] buckets;

    private int size = 0;
    private int capacity = DEFALUT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        initBuckets();
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    /*
    -연결리스트를 생성해서 배열을 채운다. 배열의 모든 인덱스 위치에는 연결 리스트가 들어있다.
    -초기 배열의 크기를 생성자를 통해서 전달할수있다.
     */
    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    //해시 데이터를 사용해서 데이터를 보관한다.
    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (bucket.contains(value)){
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    //해시 인덱스를 사용해서 데이터를 제거한다.
    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        boolean result = bucket.remove(Integer.valueOf(value));
        if (result) {
            size--;
            return true;
        }else {
            return false;
        }
    }

    //해시 인덱스를 사용해서 데이터를 확인한다.
    public boolean contains(int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    private int hashIndex(int value){
        return value % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}