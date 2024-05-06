public class Main {
    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull(3, 100);

        Smartphone hape = new Smartphone(5, "iPhone");
        Car car = new Car(5, "Black", 300);

        System.out.println("Berikut adalah deskripsi Pitbull");
        pitbull.describe();
        pitbull.getPosition();
        pitbull.move();
        pitbull.describe();
        System.out.println();
        System.out.println("Berikut adalah deskripsi Smartphone");
        hape.move();
        System.out.println();
        System.out.println("Berikut adalah deskripsi Car");
        car.move();
    }
}
