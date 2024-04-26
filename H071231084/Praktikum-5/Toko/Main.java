package Toko;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Product> listProduk = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        runApp();
    }    

    public static void runApp() {
        System.out.println("\n====================================");
        System.out.println("\nMenu: ");
        System.out.println("1. Tambah Produk");
        System.out.println("2. Tampilkan Semua Produk");
        System.out.println("3. Beli Produk");
        System.out.println("4. Keluar\n");
        System.out.print(">>> Pilih menu (1-4): ");
        int pilihan = input.nextInt();
        input.nextLine();
        switch (pilihan) {
            case 1:
                tambahProduk();
                runApp();
                break;
            case 2:
                tampilkanProduk();
                runApp();
                break;
            case 3:
                beliProduk();
                runApp();
                break;
            case 4:
                System.out.println("Terima kasih telah menggunakan layanan kami. Sampai Jumpa!");
                break;
            default:
                System.out.println("Pilih angka yang tepat!\n");
                runApp();
                break;
        }

    }

    public static void tambahProduk() {
        System.out.print("Masukkan nama produk: ");
        String nama = input.nextLine();
        System.out.print("Masukkan nomor seri: ");
        int nomor = input.nextInt();
        System.out.print("Masukkan harga: ");
        double harga = input.nextDouble();
        pilihTipe(nama, nomor, harga);
    }

    public static void pilihTipe (String namaProduk, int nomorSeri, double harga) {
        System.out.println("Pilih tipe produk: ");
        System.out.println("1. Smartphone\n2. Laptop\n3. Camera");
        System.out.print("Pilih tipe produk (1-3): ");
        int tipe = input.nextInt();
        switch (tipe) {
            case 1:
                System.out.print("Masukkan ukuran layar (inci): ");
                double layar = input.nextDouble();
                System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                int memori = input.nextInt(); 
                Smartphone smartphone = new Smartphone(namaProduk, harga, nomorSeri, layar, memori);  
                listProduk.add(smartphone);
                break;
            case 2:
                System.out.print("Masukkan ukuran RAM (GB): ");
                int ram = input.nextInt();
                input.nextLine();
                System.out.print("Masukkan tipe prosesor: ");
                String prosesor = input.nextLine();
                Laptop laptop = new Laptop(namaProduk, harga, nomorSeri, ram, prosesor);
                listProduk.add(laptop);
                break;
            case 3:
                System.out.print("Masukkan resolusi (MP): ");
                int resolusi = input.nextInt();
                input.nextLine();
                System.out.print("Masukkan tipe lensa: ");
                String lensa = input.nextLine();
                Camera camera = new Camera(namaProduk, harga, nomorSeri, resolusi, lensa);
                listProduk.add(camera);
                break;
            default:
                System.out.println("Pilih angka yang tepat!\n");
                pilihTipe(namaProduk, nomorSeri, harga);
                break;
        }
    }

    public static void tampilkanProduk() {
        System.out.println("Daftar Produk:");
        for (Product produk : listProduk) {
            produk.displayInfo();
            System.out.println();
        }
    }

    public static void beliProduk() {
        System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
        int nomor = input.nextInt();
        boolean cek = false;
        
        for (Product produk : listProduk) {
            if (produk.seriesNumber == nomor) {
                cek = true;
                System.out.println("Berhasil Membeli Produk!");
                System.out.println("Berikut info detail mengenai produk: ");
                produk.displayInfo();
            }
        }

        if (!cek) {
           System.out.println("Produk dengan nomor seri tersebut tidak ditemukan"); 
        }

    }
}