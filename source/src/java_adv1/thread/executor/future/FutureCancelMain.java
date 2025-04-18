package java_adv1.thread.executor.future;

import java.util.concurrent.*;

import static java_adv1.util.MyLogger.log;
import static java_adv1.util.ThreadUtils.sleep;

public class FutureCancelMain {
//    private static boolean mayInterruptIfRunning = true;
    private static boolean mayInterruptIfRunning = false;
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        Future<String> future = es.submit(new MyTask());
        log("future.state = " + future.state());

        sleep(3000);

        log("future.cancel(" + mayInterruptIfRunning + ") 호출");
        boolean cancelResult = future.cancel(mayInterruptIfRunning);
        log("cancel(" + mayInterruptIfRunning + ") result = " + cancelResult);

        try {
            log("future.get() = " + future.get());
        }
        catch (CancellationException e) {
            log("future 이미 취소됨");
        } catch (InterruptedException | ExecutionException exception) {
            exception.printStackTrace();
        }

        es.shutdown();
    }


    static class MyTask implements Callable<String> {
        @Override
        public String call(){
            try {
                for (int i = 0; i < 10; i++) {
                    log("작업 중");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                log("인터럽트 발생");
                return "interrupted";
            }
            return "completed";
        }
    }

}
