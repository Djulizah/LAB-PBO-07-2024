package MarketPlace;

public class Product {
    private String brand;
    private int seriesNumber;
    private double price;

    public Product(String brand, int seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getSeriesNumber() {
        return seriesNumber;
    }

    public double getPrice() {
        return price;
    }
}

