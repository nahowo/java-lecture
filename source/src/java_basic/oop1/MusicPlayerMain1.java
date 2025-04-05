package java_basic.oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        data.on();
        data.showStatus();
        data.volumUp();
        data.showStatus();
        data.volumDown();
        data.showStatus();
        data.off();
        data.showStatus();
    }
}
