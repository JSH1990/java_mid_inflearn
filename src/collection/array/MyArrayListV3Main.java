package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        //원하는 위치에 추가
        System.out.println("addLast");
        list.add(3, "addList");
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0, "addFirst");
        System.out.println(list);

        Object remove = list.remove(4);
        System.out.println(remove);
        System.out.println(list);

        Object remove1 = list.remove(0);
        System.out.println(remove1);
        System.out.println(list);


    }
}
