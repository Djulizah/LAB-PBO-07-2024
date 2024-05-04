public class Smartphone implements Entity {
    int price;
    String brand;
    
    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("The smartphone is moving");
    }
}