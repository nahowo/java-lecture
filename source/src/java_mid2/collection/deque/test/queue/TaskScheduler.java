package java_mid2.collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {
    private int remainingTask;
    private Queue<Task> queue = new ArrayDeque<>();
    public int getRemainingTask() {
        return remainingTask;
    }

    public void addTask(Task task) {
        queue.offer(task);
        remainingTask ++;
    }

    public void processNextTask() {
        queue.poll().execute();
        remainingTask --;
    }
}
