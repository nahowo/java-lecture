package java_adv1.thread.control.printer;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

import static java_adv1.util.MyLogger.log;
import static java_adv1.util.ThreadUtils.sleep;

public class MyPrinterV2 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread thread = new Thread(printer, "printer");

        thread.start();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            log("프린트할 문서를 입력하세요: ");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                thread.interrupt();
                break;
            }
            printer.add(input);
        }
    }

    static class Printer implements Runnable {
        Queue<String> jobQueue = new ConcurrentLinkedQueue<>();
        @Override
        public void run() {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    if (jobQueue.isEmpty()) {
                        continue;
                    }
                    String job = jobQueue.poll();
                    log("출력: " + job + ", 대기 문서: " + jobQueue);
                    Thread.sleep(3000);
                    log("출력 완료");
                }
            } catch (InterruptedException e) {
                log("인터럽트: " + e.getMessage());
                log("프린터 종료");
            }
        }

        private void add(String input) {
            jobQueue.offer(input);
        }
    }

}
