package java_adv1.thread.executor.future;

import java.util.Random;
import java.util.concurrent.*;

import static java_adv1.util.MyLogger.log;
import static java_adv1.util.ThreadUtils.sleep;

public class CallableMainV2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(1);
        log("submit() 호출");
        Future<Integer> future = es.submit(new MyCallable());
        log("submit 반환, future = " + future);
        log("future.get() = " + future.get()); // 호출해도 결과가 반환될 때까지 대기

        log("future.get() [블로킹] 메서드 호출 시작 -> main 스레드 WAITING");
        Integer result = future.get(); // value를 반환받을 때까지 기다림
        log("future.get() [블로킹] 메서드 호출 시작 -> main 스레드 RUNNABLE");

        log("result = " + result);
        es.close();
    }


    static class MyCallable implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            log("Callable 시작");
            sleep(2000);
            int value = new Random().nextInt(10) + 1;
            log("create value = " + value);
            log("Callable 완료");
            return value;
        }
    }

}
