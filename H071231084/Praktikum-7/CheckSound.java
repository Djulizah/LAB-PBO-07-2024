import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class CheckSound {
    public static void playMusic(String filePath) {
        try {
            File musicPath = new File(filePath);

            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                // Menunggu sampai clip selesai diputar
                Thread.sleep(clip.getMicrosecondLength() / 900);
            } else {
                System.out.println("Cannot Find File!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}