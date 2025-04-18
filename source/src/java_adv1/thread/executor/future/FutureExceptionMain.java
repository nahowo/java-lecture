package java_adv1.thread.executor.future;

import java.util.concurrent.*;

import static java_adv1.util.MyLogger.log;
import static java_adv1.util.ThreadUtils.sleep;

public class FutureExceptionMain {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        log("작업 전달");
        Future<Integer> future = es.submit(new ExCallble());
        sleep(1000);
        log("future.get() 호출 시도, future.state(): " + future.state());

        try {
            Integer result = future.get();
            log("result value: " + result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            log("e: " + e);
            Throwable cause = e.getCause();
            log("cause: " + cause);
        }
        es.close();
    }

    static class ExCallble implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            log("Callble 실행, 예외 발생");
            throw new IllegalStateException("ex!");
        }
    }

}
