public class Car implements Induk{
    int totalForwardGear;
    String color;
    int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed){
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    
    public void move(){
        System.out.println("Mobil sedang berakselerasi");
        System.out.println("Mobil " + this.color + " memiliki forward gear sejumlah " + this.totalForwardGear);
    }
}
