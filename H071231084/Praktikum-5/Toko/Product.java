package Toko;

public class Product {
    String brand;
    double price;
    int seriesNumber;

    public Product(String brand, double price, int seriesNumber) {
        this.brand = brand;
        this.price = price;
        this.seriesNumber = seriesNumber;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Serial Number: " + seriesNumber);
        System.out.println("Price: $" + price);
    }
}

class Smartphone extends Product {
    double screenSize;
    int storageCapacity;

    public Smartphone(String brand, double price, int seriesNumber, double screenSize, int storageCapacity) {
        super(brand, price, seriesNumber);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Storage Capacity: " + storageCapacity + "GB");
    }
}

class Camera extends Product {
    int resolution;
    String lensType;

    public Camera(String brand, double price, int seriesNumber, int resolution, String lensType) {
        super(brand, price, seriesNumber);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Resolution: " + resolution + "MP");
        System.out.println("Lens Type: " + lensType);
    }
}

class Laptop extends Product {
    int ramSize;
    String processorType;

    public Laptop(String brand, double price, int seriesNumber, int ramSize, String processorType) {
        super(brand, price, seriesNumber);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Processor Type: " + processorType);
        System.out.println("RAM Size: " + ramSize + "GB");
    }
}