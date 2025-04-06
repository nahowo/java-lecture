package java_basic.access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void vUp() {
        if (volume >= 100) {
            System.out.println("최대 음량");
        } else {
            volume += 10;
            System.out.println("음량 10 증가");
        }
    }

    void vDown() {
        if (volume <= 0) {
            System.out.println("최소 음량");
        } else {
            volume -= 10;
            System.out.println("음량 10 감소");
        }
    }

    void showV() {
        System.out.println("volume = " + volume);
    }
}
