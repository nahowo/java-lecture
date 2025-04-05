package java_basic.oop1;

public class MusicPlayerData {
    int volum;
    boolean isOn;

    void on() {
        isOn = true;
    }

    void off() {
        isOn = false;
    }

    void volumUp() {
        volum ++;
    }

    void volumDown() {
        volum --;
    }

    void showStatus() {
        System.out.println("volum = " + volum);
        System.out.println("isOn = " + isOn);
    }
}
