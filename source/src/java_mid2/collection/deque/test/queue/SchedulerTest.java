package java_mid2.collection.deque.test.queue;

public class SchedulerTest {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addTask(new CompressionTask());
        scheduler.addTask(new BackupTask());
        scheduler.addTask(new CleanupTask());
        scheduler.addTask(new CompressionTask());
        scheduler.addTask(new CleanupTask());

        System.out.println("== 새벽이 되었습니다. 작업을 시작합니다. ==\n");
        run(scheduler);
        System.out.println("\n== 작업이 완료되었습니다. ==");
    }

    private static void run(TaskScheduler scheduler) {
        while (scheduler.getRemainingTask() > 0) {
            scheduler.processNextTask();
        }
    }
}
