package java_basic.access.ex;

public class Counter {
    private int count;
    private int max;

    public void increment() {
        if (count >= max) {
            System.out.println("최대값 초과 불가능!");
            return;
        }
        count ++;
    }

    public void getCount() {
        System.out.println("현재값은 " + count + "입니다. ");
    }

    public Counter(int max) {
        this.max = max;
    }
}
