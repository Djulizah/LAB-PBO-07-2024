import java.util.ArrayList;
import java.util.Scanner;

class Produk {
    protected String brand;
    protected int seriesNumber;
    protected double price;

    public Produk(String brand, int seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Serial Number: " + seriesNumber);
        System.out.println("Price: $" + price);
    }
}

class Smartphone extends Produk {
    private double screenSize;
    private int storageCapacity;

    public Smartphone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity) {
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Storage Capacity: " + storageCapacity + " GB");
    }
}

class Camera extends Produk {
    private int resolution;
    private String lensType;

    public Camera(String brand, int seriesNumber, double price, int resolution, String lensType) {
        super(brand, seriesNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Resolution: " + resolution + " MP");
        System.out.println("Lens Type: " + lensType);
    }
}

class Laptop extends Produk {
    private int ramSize;
    private String processorType;

    public Laptop(String brand, int seriesNumber, double price, int ramSize, String processorType) {
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("RAM Size: " + ramSize + " GB");
        System.out.println("Processor Type: " + processorType);
    }
}

public class TP5_2_H071231019 {
    private ArrayList<Produk> products = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        System.out.println("Masukkan nama produk: ");
        String brand = scanner.nextLine();

        System.out.println("Masukkan series number: ");
        int seriesNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Masukkan harga: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Pilih tipe produk:");
        System.out.println("1. Smartphone");
        System.out.println("2. Laptop");
        System.out.println("3. Camera");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch(choice) {
            case 1:
                System.out.println("Masukkan ukuran layar (inch): ");
                double screenSize = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Masukkan kapasitas penyimapanan (GB): ");
                int storageCapacity = scanner.nextInt();
                scanner.nextLine();
                products.add(new Smartphone(brand, seriesNumber, price, screenSize, storageCapacity));
                break;
            case 2:
                System.out.println("Masukkan RAM Size (GB): ");
                int ramSize = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Masukkan Processor Type: ");
                String processorType = scanner.nextLine();

                products.add(new Laptop(brand, seriesNumber, price, ramSize, processorType));
                break;
            case 3:
                System.out.println("Masukkan resolusi (MP): ");
                int resolution = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Masukkan Lens Type: ");
                String lensType = scanner.nextLine();

                products.add(new Camera(brand, seriesNumber, price, resolution, lensType));
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }

    public void displayAllProduct() {
        System.out.println("Daftar produk: ");
        for (Produk produk : products) {
            produk.displayInfo(); 
            System.out.println(); 
        }
    }
    
    public void buyProduct() {
        System.out.println("Masukkan nomor seri produk yang ingin dibeli: ");
        int desiredSeriesNumber = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        for (Produk produk : products) {
            if (produk.seriesNumber == desiredSeriesNumber) {
                System.out.println("Anda telah membeli produk: ");
                produk.displayInfo();
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        TP5_2_H071231019 store = new TP5_2_H071231019();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.print(">>> Pilih Menu (1-4): ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    store.addProduct();
                    break;
                case 2:
                    store.displayAllProduct();
                    break;
                case 3:
                    store.buyProduct();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}