package Tugas5.Toko;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Produk> produk = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("---------------------------");
            System.out.println("           Menu            ");
            System.out.println("---------------------------");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.println("---------------------------");
            pilihan = input.nextInt();

            switch(pilihan){
                case 1:
                    addProduct(input);
                    break;
                case 2:
                    showProducts();
                    break;
                case 3:
                    buyProduct(input);
                    break;
                case 4:
                    System.out.println("Selamat Tinggal!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan masukkan 1-4.");
            }
        } while (pilihan != 4);
        input.close();
    }

    public static void addProduct(Scanner scanner){
        scanner.nextLine();
        System.out.print("Masukkan nama produk: ");
        String merek = scanner.nextLine();
        System.out.print("Masukkan nomor seri: ");
        double nomorSeri = scanner.nextDouble();
        System.out.print("Masukkan harga: ");
        int harga = scanner.nextInt();

        System.out.println("---------------------------");
        System.out.println("Pilih produk");
        System.out.println("1. Smartphone");
        System.out.println("2. Kamera");
        System.out.println("3. Laptop");
        int type = scanner.nextInt();

        switch (type) {
            case 1:
                System.out.println("Masukkan ukuran layar (inch): ");
                double layar = scanner.nextDouble();
                System.out.println("Masukkan kapasitas penyimpanan (GB): ");
                int penyimpanan = scanner.nextInt();
                produk.add(new Smartphone(merek, nomorSeri, harga, layar, penyimpanan));
                break;
            case 2:
                System.out.println("Masukkan resolusi kamera: ");
                int resolusi = scanner.nextInt();
                scanner.nextLine(); // membersihkan buffer
                System.out.println("Masukkan tipe lensa: ");
                String tipelensa = scanner.nextLine();
                produk.add(new Kamera(merek, nomorSeri, harga, resolusi, tipelensa));
                break;
            case 3:
                scanner.nextLine(); // membersihkan buffer
                System.out.println("Masukkan processor : ");
                String processor = scanner.nextLine();
                System.out.println("Masukkan RAM (GB): ");
                int ram = scanner.nextInt();
                produk.add(new Laptop(merek, nomorSeri, harga, processor, ram));
                break;
            default:
                System.out.println("Pilih 1-3!");
        }

        System.out.println("Berhasil menambahkan produk.");
    }

    public static void showProducts(){
        if (produk.isEmpty()) {
            System.out.println("Tidak ada produk yang tersedia.");
            return;
        }

        System.out.println("Daftar Produk:");
        for (Produk produk : produk) {
            produk.displayInfo();
            System.out.println();
        }
    }

    public static void buyProduct(Scanner scanner) {
        if (produk.isEmpty()) {
            System.out.println("Tidak ada produk yang tersedia untuk dibeli.");
            return;
        }

        System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
        double nomorSeri = scanner.nextDouble();

        boolean found = false;
        for (int i = 0; i < produk.size(); i++) {
            if (produk.get(i).getNomorSeri() == nomorSeri) {
                found = true;
                System.out.println("Anda telah membeli produk:");
                produk.get(i).displayInfo();
                produk.remove(i);
                break;
            }
        }

        if (!found) {
            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");
        }
    }
}
