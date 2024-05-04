public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(20000000, "iPhone");
        Car car = new Car(7, 250, "Pink");
        SiberianHusky siberianHusky = new SiberianHusky(0, 55);

        smartphone.move();
        car.move();
        siberianHusky.move();
        System.out.println();

        siberianHusky.describe();
    }
}