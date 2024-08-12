package collection.list;

public class BatchProcesserMain {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
//        MyLinkedList<Integer> list = new MyLinkedList<>(); //속도가 훨씬 빠르다.

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(1_000_000);
    }
}
