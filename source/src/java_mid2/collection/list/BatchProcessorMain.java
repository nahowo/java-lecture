package java_mid2.collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        BatchProcessor processor = new BatchProcessor(linkedList); // 어떤 구현체를 사용해 메서드를 수행할지 런타임 시간에 결정
        processor.logic(50_000);
    }
}
