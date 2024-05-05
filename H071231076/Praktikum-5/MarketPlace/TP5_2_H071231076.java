package MarketPlace;

import java.util.ArrayList;
import java.util.Scanner;

public class TP5_2_H071231076 {
    private ArrayList<Product> products = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        System.out.print("Masukkan nama produk: ");
        String brand = scanner.nextLine();
        System.out.print("Masukkan nomor seri: ");
        int seriesNumber = scanner.nextInt();
        System.out.print("Masukkan harga: ");
        double price = scanner.nextDouble();

        System.out.println("Pilih tipe produk:");
        System.out.println("1. Smartphone");
        System.out.println("2. Laptop");
        System.out.println("3. Camera");
        System.out.print("Pilih tipe produk (1-3): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Masukkan ukuran layar (inci): ");
            double screenSize = scanner.nextDouble();
            System.out.print("Masukkan kapasitas penyimpanan (GB): ");
            int storageCapacity = scanner.nextInt();
            scanner.nextLine(); 
            products.add(new Smartphone(brand, seriesNumber, price, screenSize, storageCapacity));
        } else if (choice == 2) {
            System.out.print("Masukkan ukuran RAM (GB): ");
            int ramSize = scanner.nextInt();
            System.out.print("Masukkan tipe prosesor: ");
            scanner.nextLine(); 
            String processorType = scanner.nextLine();
            products.add(new Laptop(brand, seriesNumber, price, ramSize, processorType));
        } else if (choice == 3) {
            System.out.print("Masukkan resolusi (MP): ");
            int resolution = scanner.nextInt();
            System.out.print("Masukkan jenis lensa: ");
            scanner.nextLine(); 
            String lensType = scanner.nextLine();
            products.add(new Camera(brand, seriesNumber, price, resolution, lensType));
        }
    }

    public void displayAllProducts() {
        System.out.print("Daftar Produk:");
        for (Product product : products) {
            if (product instanceof Smartphone) {
                ((Smartphone) product).displaySmartphoneInfo();
            } else if (product instanceof Laptop) {
                ((Laptop) product).displayLaptopInfo();
            } else if (product instanceof Camera) {
                ((Camera) product).displayCameraInfo();
            }
            System.out.println();
        }
    }

    public void buyProduct() {
        System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
        int seriesNumber = scanner.nextInt();
        boolean found = false;
        for (Product product : products) {
            if (product.getSeriesNumber() == seriesNumber) {
                System.out.print("Anda telah membeli produk:");
                if (product instanceof Smartphone) {
                    ((Smartphone) product).displaySmartphoneInfo();
                } else if (product instanceof Laptop) {
                    ((Laptop) product).displayLaptopInfo();
                } else if (product instanceof Camera) {
                    ((Camera) product).displayCameraInfo();
                }
                products.remove(product);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.print("Produk dengan nomor seri tersebut tidak ditemukan.");
        }
    }

    public void start() {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.print(">> Pilih menu (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayAllProducts();
                    break;
                case 3:
                    buyProduct();
                    break;
                case 4:
                    System.out.print("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                    return;
                default:
                    System.out.print("Pilihan tidak valid. Coba lagi.");
            }
        }
    }

    public static void main(String[] args) {
        TP5_2_H071231076 system = new TP5_2_H071231076();
        system.start();
    }
}

