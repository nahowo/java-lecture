package java_mid2.collection.list;

public class BatchProcessor {
    private final MyList<Integer> list;

    public BatchProcessor(MyList<Integer> list) { // 런타임 시점에 구체 클래스를 지정하도록 미룸: 의존관계 주입(생성자를 사용했기 때문에 생성자 의존관계 주입)
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i, 0); // 0번째 인덱스에 추가: ArrayList는 O(n), LinkedList는 O(1)
        }
        long endTime = System.currentTimeMillis();
        System.out.println("소요 시간: " + (endTime - startTime) + "ms");
    }
}
