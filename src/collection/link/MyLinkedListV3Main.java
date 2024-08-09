package collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String string = stringList.get(0);
        System.out.println(string);

        MyLinkedListV3<Integer> iniList = new MyLinkedListV3<>();
        iniList.add(1);
        iniList.add(2);
        iniList.add(3);
        Integer integer = iniList.get(0);
        System.out.println(integer);

    }
}
