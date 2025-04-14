package java_mid2.collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class PrinterQueueTest {
    public static void main(String[] args) {
        Queue<String> printQueue = new ArrayDeque<>();

        printQueue.offer("문서 1");
        printQueue.offer("문서 2");
        printQueue.offer("문서 3");

        System.out.println(printQueue.poll());
        System.out.println(printQueue.poll());
        System.out.println(printQueue.poll());
    }
}
