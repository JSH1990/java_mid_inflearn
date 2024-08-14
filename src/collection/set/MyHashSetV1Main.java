package collection.set;

public class MyHashSetV1Main {
    /*
    생성 : 배열의 크기를 10으로 지정했다. 여기서는 기본생성자를 사용하지않았다.

    저장 : 실행 결과를 보면 99,9 의 경우 해시 인덱스가 9로 충돌하게 된다. 따라서 배열의 같은 9번 인덱스위치에 저장된 것을 확인할수있다.
    그리고 그 안에 있는 연결 리스트에 99,9가 함께 저장된다.

    검색 : 9를 검색하는 경우, 해시 인덱스가 9이다. 따라서 배열의 9번 인덱스에 있는 연결리스트를 먼저 찾는다. 해당 연결리스트에 있는 모든데이터를
        순서대로 비교하면서 9를 찾는다.
     */
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);
        System.out.println(set);


        //검색
        int searchValue = 9;
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);

        //삭제
        boolean removeResult = set.remove(searchValue);
        System.out.println("removeResult = " + removeResult);
        System.out.println(set);
    }
}
