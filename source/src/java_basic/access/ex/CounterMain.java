package java_basic.access.ex;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter = new Counter(2);

        counter.increment();
        counter.getCount();
        counter.increment();
        counter.getCount();
        counter.increment();
        counter.getCount();
    }
}
