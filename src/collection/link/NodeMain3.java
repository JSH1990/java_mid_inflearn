package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        //모든 노드 탐색하기
        System.out.println();
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        //마지막 노드 조회하기
        System.out.println();
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        //특정 index의 노드조회
        System.out.println();
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node);
//        System.out.println("index2Node = " + index2Node.item); //값만조회

        //데이터 추가하기
        System.out.println();
        System.out.println("데이터 추가하기");
        add(first, "D");
        System.out.println(first);
    }

    //모든 노드 조회
    private static void printAll(Node node){
        Node x = node;
        while (x != null){
            System.out.println(x.item);
            x = x.next;
        }
    }

    //마지막 노드 조회
    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null){
            x = x.next;
        }
        return x; //마지막 노드
    }

    //노드 조회
    //x.next를 호출할때 마다, x가 참조하는 노드의 위치가 순서대로 하나씩 증가한다.
    //index의 수 만큼만 반복해서 이동하면 원하는 위치의 노드를 찾을 수 있다.
    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    //노드 추가
    //마지막 노드 조회후, 새로운 노드 마지막노드에 추가
    private static void add(Node node, String param) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);
    }
}
