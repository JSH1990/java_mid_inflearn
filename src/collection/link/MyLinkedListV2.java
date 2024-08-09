package collection.link;

public class MyLinkedListV2 {
    private Node first; //첫 노드의 위치를 가르킨다.
    private int size= 0; //자료 구조에 입력된 데이터의 사이즈, 데이터가 추가될 때 마다 하나씩 증가한다.

    /*
    마지막 데이터를 추가한다.
    새로운 노드를 만들고, 마지막 노드를 찾아서 새로운 노드를 마지막에 연결한다.
    만약 노드가 하나도 없다면 새로운 노드를 만들고, first에 연결한다.
     */
    public void add(Object e){
        Node newNode = new Node(e); //새로운 노드생성

        if(first == null){
            first = newNode;
        }else {
            Node lastNode = getLastNode(); //첫 노드가 아니면 마지막 노드 가져와서 첫노드 뒤에 붙인다.
            lastNode.next = newNode;
        }
        size++; // 노드가 추가될때마다 size가 하나씩 증가한다.
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    //추가코드
    public void add(int index, Object e) {
        Node newNode = new Node(e);
        if (index == 0) {
            newNode.next = first;
            first = newNode; //first에게 newNode가 첫번째 노드인지 알려주기위함
        }else {
            //중간에 노드를 넣을경우
            Node prev = getNode(index - 1); //새로만드는 위치의 앞 노드를 조회한다.
            newNode.next = prev.next; //뒷 노드확인한다.
            prev.next = newNode; //앞 노드의 next값에 새로운 노드를 넣는다.
        }
        size++;
    }


    /*
    특정 위치에 있는 데이터를 찾아서 변경한다. 그리고 기존값을 반환한다.
    getNode(index)를 통해 특정 위치에 있는 노드를 찾고, 단순히 그 노드에 있는 item데이터를 변경한다.
    */
    public Object set(int index, Object element){
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    //추가코드
    //중간 위치의 노드 삭제
    public Object remove(int index){
        Node removeNode = getNode(index);
        Object removedItem = removeNode.item;
        if(index == 0){
            first = removeNode.next; //index가 0이면 첫번째 노드이므로, first에 넣는다.
        }else {
            Node prev = getNode(index - 1); //삭제할 앞에 노드 조회
            prev.next = removeNode.next; //삭제할 노드만 빼버리고, 삭제할 노드 앞뒤로 이어붙임
        }

        //삭제할 노드 null처리
        removeNode.item = null;
        removeNode.next = null;
        size--; //삭제했으니, 사이즈 줄임
        return removedItem;
    }

    /*
    특정 위치에 있는 데이터를 반환한다.
    getNode(index)를 통해 특정 위치에 있는 노드를 찾고, 해당 노드에 있는 값을 반환한다.
     */
    public Object get(int index){
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    /*
    데이터를 검색하고, 검색된 위치를 반환한다.
    모든 노드를 순회하면서 equals()를 사용해서 같은 데이터가 있는지 찾는다.
     */
    public int indexOf(Object o){
        int index = 0;
        for (Node x = first; x != null; x = x.next) {
            if(o.equals(x.item)){
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
