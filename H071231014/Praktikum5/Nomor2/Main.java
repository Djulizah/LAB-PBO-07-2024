package Nomor2;
import java.util.Scanner;
import java.util.ArrayList;
// import soal2.Camera;
// import soal2.Product;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Product> listproduk = new ArrayList<>();

    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();
    }
    private static void runApp() {
        System.out.println("Menu:");
        System.out.println("1. Tambah produk");
        System.out.println("2. Tampilkan Semua Produk");
        System.out.println("3. Beli Produk");
        System.out.println("4. Keluar");
        System.out.println();
        System.out.print(">>> Pilih Menu (1-4): ");

        int selectMenu = scanner.nextInt();
        scanner.nextLine();
        switch (selectMenu) {
            case 1:
                tambahProduk(scanner);
                break;
            case 2:
                tampilkanSemuaProduk();
                break;
            case 3:
                beliProduk();
                break;
            case 4:
            System.out.println("Terima kasih Telah Menggunakan Aplikasi Kami");
                System.exit(0);
            default:
            System.out.println("Pilihan Tidak Valid");
                runApp();
        }
    }
    private static void tambahProduk(Scanner scanner) {
        System.out.print("Masukkan Nama Produk: ");
        String brand = scanner.next();
        System.out.print("Masukkan Nomor Seri: ");
        int seriesNumber = scanner.nextInt();
        System.out.print("Masukkan Harga: ");
        double price = scanner.nextDouble();
        System.out.println("Pilih Tipe Produk: ");
        System.out.println("1. Smartphone");
        System.out.println("2. Camera");
        System.out.println("3. Laptop");
        System.out.print("Pilih Tipe Produk: (1-3): ");
        int selectProduct = scanner.nextInt();
        switch (selectProduct) {
            case 1:
                System.out.print("Masukkan Ukuran Layar (inci): ");
                int screensize = scanner.nextInt();
                System.out.print("Masukkan Kapasitas Penyimpanan: ");
                int storageCapacity = scanner.nextInt();
                Smartphone smartphone = new Smartphone(brand,seriesNumber,price,screensize, storageCapacity);
                listproduk.add(smartphone);
                runApp();
                break;
            case 2:
                System.out.print("Masukkan Resolusi: ");
                int resolution = scanner.nextInt();
                System.out.print("Masukkan Jenis Lensa Kamera: ");
                String lensType = scanner.next();
                Camera camera = new Camera(brand, seriesNumber, price, resolution, lensType);                
                listproduk.add(camera);
                runApp();
                break;
            case 3:
                System.out.print("Masukkan Ukuran RAM: ");
                int ramsize = scanner.nextInt();
                System.out.print("Masukkan Jenis prosesor: ");
                String processorType = scanner.next();
                Laptop laptop = new Laptop(brand, seriesNumber, price,ramsize, processorType);
                listproduk.add(laptop);
                runApp();
                break;
            default:
                break;
        }
        
    }
    private static void tampilkanSemuaProduk() {
        System.out.println("Daftar Produk:");
        for (Product product : listproduk) {
            product.displayInfo();
            System.out.println();
        }
        runApp();
    }

    private static void beliProduk() {
        System.out.print("Masukkan Nomor Seri Produk Yang ingin diBeli:");
        int seriesNumber = scanner.nextInt();
        boolean isProductFound = false;
        for (Product product : listproduk) {
            if (product.getSeriesNumber() == seriesNumber) {
                isProductFound = true;
                System.out.println("Anda Telah Membeli Produk:");
                product.displayInfo();
                break;
            }
        }
        if (!isProductFound) {
            System.out.println("Produk Yang Ingin diBeli Tidak diTemukan.");
        }
    }
}