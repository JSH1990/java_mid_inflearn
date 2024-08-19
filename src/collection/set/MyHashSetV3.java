package collection.set;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Set;

public class MyHashSetV3<E> implements MySet<E> {
    //기본 생성자를 사용하면 16이 사용된다.
    static final int DEFALUT_INITIAL_CAPACITY = 16;

    private LinkedList<E>[] buckets;

    /*
     연결리스트를 여러개 만든 배열생성
     -배열안에 연결 리스트가 들어있고, 연결리스트안에 데이터가 저장된다.
     -해시 인덱스가 충돌이 발생하면 같은 연결리스트안에 여러 데이터가 저장된다.

     - MyhashSetV1은 Integer 숫자만 저장할 수 있었다. 여기서는 모든 타입을 저장할수있도록 object를 사용한다.
     - 추가로 저장, 검색, 삭제 메서드의 매개변수도 Object로 변경했다.
     */

    private int size = 0;
    private int capacity = DEFALUT_INITIAL_CAPACITY;

    public MyHashSetV3() {
        initBuckets();
    }

    public MyHashSetV3(int capacity) {
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
    public boolean add(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        if (bucket.contains(value)){
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    //해시 인덱스를 사용해서 데이터를 제거한다.
    public boolean remove(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        boolean result = bucket.remove(value);
        if (result) {
            size--;
            return true;
        }else {
            return false;
        }
    }

    //해시 인덱스를 사용해서 데이터를 확인한다. 0(1)
    public boolean contains(E searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<E> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    /*
    - Object의 hashcode()를 호출해서 해시 코드를 찾는다. 그리고 찾은 해시 코드를 배열의 크기(capacity)로 나머지 연산을 수행한다.
    이렇게 해시 코드를 기반으로 해시 인덱스를 계산해서 반환한다.
    - Object의 hashCode()를 사용한 덕분에 모든 객체의 hashCode()를 구할수 있다. 물론 다형성에 의해 오버라이딩이 된 hashCode()가 호출된다.
    - hashCode()의 실행 결과로 음수가 나올수 있는데, 배열의 인덱스로 음수는 사용할 수 없다. Math.abs()를 사용하면 마이너스를 제거해서 항상 양수를 얻을수 있다.
     */
    public int hashIndex(Object value){
        //int hashCode = value.hashCode(); //음수도 있을수 있음
        //int hashIndex = Math.abs(hashCode) % capacity; //절대값 사용

        //int hashIndex = Math.abs(value.hashCode()) % capacity; //음수도 있을수 있음 절대값 사용
        return Math.abs(value.hashCode()) % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }

}