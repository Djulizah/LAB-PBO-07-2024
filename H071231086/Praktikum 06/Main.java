package Tugas06;

import Tugas06.abstrak.Bulldog;
import Tugas06.abstrak.GermanShepherd;
import Tugas06.abstrak.Pitbull;
import Tugas06.abstrak.SiberianHusky;
import Tugas06.interfaces.Mobil;
import Tugas06.interfaces.Smartphone;

public class Main {

    public static void main(String[] args) {

        Pitbull pitbull = new Pitbull(0, 3);
        SiberianHusky siberianHusky = new SiberianHusky(0, 1);
        Bulldog bulldog = new Bulldog(0, 6);
        GermanShepherd germanShepherd = new GermanShepherd(0, 1);

        
        Smartphone smartphone = new Smartphone(5000, "Oppo");
        Mobil car = new Mobil(6, "Hitam", 200);

        
        garis();
        moveAllDogs(pitbull, siberianHusky, bulldog, germanShepherd);
        garis();
        smartphone.move();
        garis();
        car.move();
        garis();

        
        describeAllDogs(pitbull, siberianHusky, bulldog, germanShepherd);
        garis();

    
        System.out.println("Informasi Smartphone:");
        garis();
        System.out.println("Harga: " + smartphone.getPrice());
        System.out.println("Merek: " + smartphone.getBrand());
        garis();

        
        System.out.println("Informasi Mobil:");
        garis();
        System.out.println("Jumlah Gigi Maju: " + car.getTotalForwardGear());
        System.out.println("Warna: " + car.getColor());
        System.out.println("Kecepatan Maksimum: " + car.getSpeed());
        garis();
    }

    private static void moveAllDogs(Dog... dogs) {
        for (Dog dog : dogs) {
            dog.move();
        }
    }

    private static void describeAllDogs(Dog... dogs) {
        for (Dog dog : dogs) {
            dog.describe();
        }
    }

    private static void garis() {
        System.out.println("==================================");
    }
}
