package Tugas7;

import javax.sound.sampled.*;
import java.io.File;

public class Sound {

    public static void Sound1() {
        try {
            // Lokasi file suara
            String fileSuara = "C:/Users/user/Downloads/violin-win-5-185128.wav";

            // Membuat objek File dari lokasi file suara
            File suaraFile = new File(fileSuara);

            // Membuat objek AudioInputStream dari file suara
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(suaraFile);

            // Mendapatkan format audio dari file suara
            AudioFormat audioFormat = audioInputStream.getFormat();

            // Membuat DataLine.Info untuk Clip
            DataLine.Info info = new DataLine.Info(Clip.class, audioFormat);

            // Mendapatkan Clip dari DataLine
            Clip clip = (Clip) AudioSystem.getLine(info);

            // Membuka Clip
            clip.open(audioInputStream);

            // Memainkan Clip
            clip.start();

            // Menunggu Clip selesai
            Thread.sleep(clip.getMicrosecondLength() / 1000);

            // Menutup Clip dan AudioInputStream
            clip.close();
            audioInputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void Sound2(){
        try {
            // Lokasi file suara
            String fileSuara = "C:/Users/user/Downloads/buzzer-4-183895.wav";

            // Membuat objek File dari lokasi file suara
            File suaraFile = new File(fileSuara);

            // Membuat objek AudioInputStream dari file suara
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(suaraFile);

            // Mendapatkan format audio dari file suara
            AudioFormat audioFormat = audioInputStream.getFormat();

            // Membuat DataLine.Info untuk Clip
            DataLine.Info info = new DataLine.Info(Clip.class, audioFormat);

            // Mendapatkan Clip dari DataLine
            Clip clip = (Clip) AudioSystem.getLine(info);

            // Membuka Clip
            clip.open(audioInputStream);

            // Memainkan Clip
            clip.start();

            // Menunggu Clip selesai
            Thread.sleep(clip.getMicrosecondLength() / 1000);

            // Menutup Clip dan AudioInputStream
            clip.close();
            audioInputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
