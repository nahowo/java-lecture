package java_adv3.parallel.forkjoin;

import java_adv3.parallel.HeavyJob;

import java.util.List;
import java.util.concurrent.RecursiveTask;

import static java_adv1.util.MyLogger.log;

public class SumTask extends RecursiveTask<Integer> {

    private static final int THRESHOLD = 2;

    private final List<Integer> list;

    public SumTask(List<Integer> list) {
        this.list = list;
    }

    @Override
    protected Integer compute() {
        if (list.size() <= THRESHOLD) {
            log("[처리 시작] " + list);
            int sum = list.stream()
                    .mapToInt(HeavyJob::heavyTask)
                    .sum();
            log("[처리 완료] " + list + " -> sum: " + sum);
            return sum;
        } else {
            int mid = list.size() / 2;
            List<Integer> left = list.subList(0, mid);
            List<Integer> right = list.subList(mid, list.size());
            log("[분할] " + list + " -> left: " + left + ", right: " + right);

            SumTask leftTask = new SumTask(left);
            SumTask rightTask = new SumTask(right);

            leftTask.fork();
            Integer rightResult = rightTask.compute();

            Integer leftResult = leftTask.join();
            int joinSum = leftResult + rightResult;
            log("[결과] left: " + leftResult + ", right: " + right + " -> sum: " + joinSum);
        }
        return 0;
    }
}
