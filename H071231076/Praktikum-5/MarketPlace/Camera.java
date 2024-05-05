package MarketPlace;

public class Camera extends Product {
    private int resolution;
    private String lensType;

    public Camera(String brand, int seriesNumber, double price, int resolution, String lensType) {
        super(brand, seriesNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    public void displayCameraInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Serial Number: " + getSeriesNumber());
        System.out.println("Price: " + getPrice());
        System.out.println("Resolution: " + resolution + "MP");
        System.out.println("Lens Type: " + lensType);
    }
}
