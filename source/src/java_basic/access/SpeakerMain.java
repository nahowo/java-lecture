package java_basic.access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.vUp();
        speaker.showV();

        speaker.vUp();
        speaker.showV();

        speaker.showV();
    }
}
