import javax.sound.sampled.AudioInputStream;

public class AudioPlayer {
    public static void main(String[] args) {
        String filePath = "dark-future-logo-196217.mp3";

        AudioInputStream audioStream = AudioSystem.getAudioInputStream(filePath);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();

        
System.out.println("Closing...`")
    }
}
