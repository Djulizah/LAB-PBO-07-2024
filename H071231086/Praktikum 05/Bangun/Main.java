package Tugas5.Bangun;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.println("====== BANGUN RUANG ======");
        System.out.println("1.KUBUS");
        System.out.println("2.BALOK");
        System.out.println("3.BOLA");
        System.out.println("4. TABUNG");
        System.out.println("====== BANGUN DATAR ======");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. TRAPESIUM");
        System.out.println("---------------------------");
        System.out.print("Pilihan : ");
        int pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan) {
            case 1:
                kubus Kubus = new kubus();
                System.out.print("Masukan sisi : ");
                kubus.sisi = input.nextDouble();
                System.out.println("---------------------------");
                Kubus.luas();
                Kubus.volume(); 
                System.out.println("---------------------------");
                break;

            case 2:
                balok Balok = new balok();
                System.out.print("Masukkan Panjang : " );
                Balok.panjang = input.nextDouble();
                System.out.print("Masukkan Lebar : ");
                Balok.lebar = input.nextDouble();
                System.out.print("Masukkan Tinggi : ");
                Balok.tinggi = input.nextDouble();
                System.out.println("---------------------------");
                Balok.luas();
                Balok.volume();
                System.out.println("---------------------------");
                break;

            case 3:
                bola Bola = new bola();
                System.out.print("Masukkan Jari-jari : ");
                Bola.jarijari = input.nextDouble();
                System.out.println("---------------------------");
                Bola.luas();
                Bola.volume();
                System.out.println("---------------------------");

            case 4:
                tabung Tabung = new tabung();
                System.out.print("Masukkan Jari-jari : ");
                Tabung.jari = input.nextDouble();
                System.out.print("Masukkan Tinggi : ");
                Tabung.tinggi = input.nextDouble();
                System.out.println("---------------------------");
                Tabung.luas();
                Tabung.volume();
                System.out.println("---------------------------");
                break;

            case 5:
                persegi Persegi = new persegi();
                System.out.print("Masukkan Sisi : ");
                Persegi.sisi = input.nextDouble();
                System.out.println("---------------------------");
                Persegi.luas();
                Persegi.keliling();
                System.out.println("---------------------------");
                break; 

            case 6:
                persegipanjang PersegiPanjang = new persegipanjang();
                System.out.print("Masukkan Panjang : ");
                PersegiPanjang.panjang = input.nextDouble();
                System.out.print("Masukkan Lebar : ");
                PersegiPanjang.lebar = input.nextDouble();
                System.out.println("---------------------------");
                PersegiPanjang.keliling();
                PersegiPanjang.luas();
                System.out.println("---------------------------");
                break;

            case 7:
                lingkaran lingkaran = new lingkaran();
                System.out.print("Masukkan Jari-jari : ");
                lingkaran.jarijari = input.nextDouble();
                System.out.println("---------------------------");
                lingkaran.luas();
                lingkaran.keliling();
                System.out.println("---------------------------");
                break;
            case 8:
                trapesium trapesium = new trapesium();
                System.out.print("Masukkan sisi 1 : ");
                trapesium.a = input.nextDouble();
                System.out.print("Masukkan sisi 2 : ");
                trapesium.b = input.nextDouble();
                System.out.print("Masukkan sisi 3 : ");
                trapesium.c = input.nextDouble();
                System.out.print("Masukkan sisi 4 : ");
                trapesium.d = input.nextDouble();
                System.out.print("Masukkan Tinggi : ");
                trapesium.t = input.nextDouble();
                System.out.println("---------------------------");
                trapesium.luas();
                trapesium.keliling();
                System.out.println("---------------------------");
                break;

            default:
                System.out.println("Masukkan Angka 1-8");
                System.out.println("---------------------------");
                break;
        }
        input.close();

    }
}