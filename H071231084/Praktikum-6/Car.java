public class Car implements Entity {
    int totalForwardGear, maxSpeed;
    String color;
    
    public Car(int totalForwardGear, int maxSpeed, String color) {
        this.totalForwardGear = totalForwardGear;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println("The car is accelerating");
    }
}
