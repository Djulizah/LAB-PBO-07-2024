interface Movable {
    void move();
}

interface Describable {
    void describe();
}

abstract class Dog implements Movable, Describable {
    protected int position;
    protected int averageLength;

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    public int getPosition() {
        return position;
    }
}

class Pitbull extends Dog {
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 3;
    }

    @Override
    public void describe() {
        System.out.println("Pitbull adalah ras anjing yang kuat dan berotot.");
    }
}

class SiberianHusky extends Dog {
    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 2;
    }

    @Override
    public void describe() {
        System.out.println("Siberian Husky memiliki bulu yang tebal dan cocok di daerah bersalju.");
    }
}

class Bulldog extends Dog {
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 1;
    }

    @Override
    public void describe() {
        System.out.println("Bulldog adalah ras anjing dengan bentuk yang pendek dan gemuk.");
    }
}

class GermanShepherd extends Dog {
    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 3;
    }

    @Override
    public void describe() {
        System.out.println("German Shepherd adalah ras anjing yang pintar dan mudah dilatih.");
    }
}

class Smartphone implements Movable {
    public int price;
    public String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Smartphone berpindah.");
    }
}

class Car implements Movable {
    public int totalForwardGear;
    public String color;
    public int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi.");
    }
}

public class TP6_1_H071231076 {
    public static void main(String[] args) {
        Dog pitbull = new Pitbull(0, 50);
        Dog siberianHusky = new SiberianHusky(0, 60);
        Dog bulldog = new Bulldog(0, 40);
        Dog germanShepherd = new GermanShepherd(0, 70);

        pitbull.move();
        System.out.println("Posisi Pitbull: " + pitbull.getPosition());
        pitbull.describe();

        siberianHusky.move();
        System.out.println("Posisi Siberian Husky: " + siberianHusky.getPosition());
        siberianHusky.describe();

        bulldog.move();
        System.out.println("Posisi Bulldog: " + bulldog.getPosition());
        bulldog.describe();

        germanShepherd.move();
        System.out.println("Posisi German Shepherd: " + germanShepherd.getPosition());
        germanShepherd.describe();

        Smartphone smartphone = new Smartphone(1000, "Apple");
        smartphone.move();

        Car car = new Car(6, "Red", 200);
        car.move();
    }
}
