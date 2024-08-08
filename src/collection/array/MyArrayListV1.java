package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5; //리스트를 생성할때 사용하는 기본 배열의 크기

    private Object[] elementData; //다양한 타입을 보관하기 위해 Object 배열 사용
    private int size = 0; //리스트의 크기. 데이터가 없으면 size는 0

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) { //리스트에 데이터 추가. 데이터를 추가하면 size가 하나 증가한다.
        elementData[size] = e;
        size++;
    }

    public Object get(int index) { //인덱스에 있는 항목을 조회한다.
        return elementData[index];
    }

    public Object set(int index, Object element) { //인덱스에 있는 항목을 변경한다.
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o) { //검색기능이다. 리스트를 순차탐색해서, 인수와 같은 데이터가 있는 인덱스의 위치를 반환한다. 데이터가 없으면 -1을 반환한다.
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + //size 크기의 배열을 새로 만든다. 여기서는 toString() 출력시 size이후의 의미없는 값을 출력하지않기위해 사용한다.

                " size= " + size + ", capacity= " + elementData.length;
    }
}