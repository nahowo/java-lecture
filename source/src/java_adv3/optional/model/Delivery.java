package java_adv3.optional.model;

public class Delivery {
    private String staus;
    private boolean canceled;

    public String getStaus() {
        return staus;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public Delivery(String staus, boolean canceled) {
        this.staus = staus;
        this.canceled = canceled;
    }
}
