package Bangun;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        runApp();
    }

    public static void Batas() {
        System.out.println("----------------------------------");
    }

    public static void runApp() {
        Batas();
        System.out.println("========== BANGUN RUANG ==========");
        System.out.println("1. KUBUS\n2. BALOK\n3. BOLA\n4. TABUNG");
        System.out.println("========== BANGUN DATAR ==========");
        System.out.println("5. PERSEGI\n6. PERSEGI PANJANG\n7. LINGKARAN\n8. TRAPESIUM");
        Batas();
        System.out.print("Pilihan: ");

        int pilihan = input.nextInt();
        input.nextLine();
        Batas();
        switch (pilihan) {
            case 1:
                Kubus kubus = new Kubus();
                System.out.print("Masukkan sisi kubus: ");
                kubus.s = input.nextDouble();
                hitungBangunRuang(kubus);
                break;
            case 2:
                Balok balok = new Balok();
                System.out.print("Masukkan panjang balok: ");
                balok.p = input.nextDouble();
                System.out.print("Masukkan lebar balok: ");
                balok.l = input.nextDouble();
                System.out.print("Masukkan tinggi balok: ");
                balok.t = input.nextDouble();
                hitungBangunRuang(balok);
                break;
            case 3:
                Bola bola = new Bola();
                System.out.print("Masukkan jari-jari bola: ");
                bola.r = input.nextDouble();
                hitungBangunRuang(bola);
                break;
            case 4:
                Tabung tabung = new Tabung();
                System.out.print("Masukkan jari-jari tabung: ");
                tabung.r = input.nextDouble();
                System.out.print("Masukkan tinggi tabung: ");
                tabung.t = input.nextDouble();
                hitungBangunRuang(tabung);
                break;
            case 5:
                Persegi persegi = new Persegi();
                System.out.print("Masukkan sisi persegi: ");
                persegi.s = input.nextDouble();
                hitungBangunDatar(persegi);
                break;
            case 6:
                PersegiPanjang persegiPanjang = new PersegiPanjang();
                System.out.print("Masukkan panjang persegi panjang: ");
                persegiPanjang.p = input.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                persegiPanjang.l = input.nextDouble();
                hitungBangunDatar(persegiPanjang);
                break;
            case 7:
                Lingkaran lingkaran = new Lingkaran();
                System.out.print("Masukkan jari-jari lingkaran: ");
                lingkaran.r = input.nextDouble();
                hitungBangunDatar(lingkaran);
                break;
            case 8:
                Trapesium trapesium = new Trapesium();
                System.out.print("Masukkan sisi 1 trapesium: ");
                trapesium.a = input.nextDouble();
                System.out.print("Masukkan sisi 2 trapesium: ");
                trapesium.b = input.nextDouble();
                System.out.print("Masukkan sisi 3 trapesium: ");
                trapesium.c = input.nextDouble();
                System.out.print("Masukkan sisi 4 trapesium: ");
                trapesium.d = input.nextDouble();
                System.out.print("Masukkan tinggi trapesium: ");
                trapesium.t = input.nextDouble();
                hitungBangunDatar(trapesium);
                break;
            default:
                System.out.println("Pilihan tidak valid! Pilih angka yang tersedia!");
                runApp();
                break;
        }
            
        Batas();
        System.out.print("Ketik '1' untuk menampilkan ulang menu: ");
        int ulang = input.nextInt();
        if (ulang == 1) {
            runApp();
        } else {
            Batas();
            System.out.println("Program selesai!");
        }
    }

    public static void hitungBangunRuang(BangunRuang bangun) {
        Batas();
        bangun.Luas();
        bangun.Volume();
    }

    public static void hitungBangunDatar(BangunDatar bangun) {
        Batas();
        bangun.Luas();
        bangun.Keliling();        
    }
}