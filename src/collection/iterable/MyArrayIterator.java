package collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator {
    private int currentIndex = -1;
    private int[] targetArr; //MyArrayIterator가 접근할 배열

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    } //순회하고 싶은 배열

    @Override
    public boolean hasNext() {
    return currentIndex < targetArr.length - 1;
    } //현재 인덱스가 마지막순서 배열보다 밑에 있는지 여부

    @Override
    public Integer next() {
        //배열의 0번을 꺼낸다.
        return targetArr[++currentIndex];
        
    }
}
