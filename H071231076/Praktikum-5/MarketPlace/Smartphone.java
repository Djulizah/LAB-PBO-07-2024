package MarketPlace;

public class Smartphone extends Product {
    private double screenSize;
    private int storageCapacity;

    public Smartphone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity) {
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    public void displaySmartphoneInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Serial Number: " + getSeriesNumber());
        System.out.println("Price: " + getPrice());
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Storage Capacity: " + storageCapacity + "GB");
    }
}
