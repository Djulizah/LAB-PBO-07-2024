public class TP6_1_H071231064 {
    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull("dapit", "augh", 5, 0, 3);
        SiberianHusky siberianHusky = new SiberianHusky("ber", "augh", 0, 2);
        Bulldog bulldog = new Bulldog("dok", "augh", 9, 0, 1);
        GermanShepherd germanShepherd = new GermanShepherd("adolf", "bonjour", 0, 3);

        Smartphone redmi = new Smartphone(3500, "Xiaomi");
        Car alphard = new Car(5, "black", 170);
        Car porsche = new Car(6, "red", 230);

        redmi.move();
        alphard.move();
        porsche.move();


        System.out.println("================================");
        pitbull.describe();
        System.out.println("================================");
        siberianHusky.describe();
        System.out.println("================================");
        bulldog.describe();
        System.out.println("================================");
        germanShepherd.describe();
        System.out.println("================================");

        pitbull.move();
        siberianHusky.move();
        bulldog.move();
        germanShepherd.move();

        pitbull.describe();
        System.out.println("================================");
        siberianHusky.describe();
        System.out.println("================================");
        bulldog.describe();
        System.out.println("================================");
        germanShepherd.describe();
        System.out.println("================================");
    }
}

class Pitbull extends Dog implements ISesuatu{

    String suara,nama;
    int lebarPipi;
    public Pitbull(String nama,String suara,int lebarPipi,int position, int averageLength) {
        super(position, averageLength);
        this.nama = nama;
        this.suara = suara;
        this.lebarPipi = lebarPipi;
    }

    @Override
    public void move() {
        super.position += super.averageLength;
    }

    @Override
    public void describe() {
        System.out.println("Nama :"+nama);
        System.out.println("Suara :"+suara);
        System.out.println("Lebar Pipi :"+lebarPipi);
        dogDescribe();
    }
    
}
class SiberianHusky extends Dog implements ISesuatu{

    String suara,nama;
    public SiberianHusky(String nama,String suara,int position, int averageLength) {
        super(position, averageLength);
        this.nama = nama;
        this.suara = suara;
    }

    @Override
    public void move() {
        super.position += super.averageLength;
    }

    @Override
    public void describe() {
        System.out.println("Nama :"+nama);
        System.out.println("Suara :"+suara);
        dogDescribe();
    }
    
}
class Bulldog extends Dog implements ISesuatu{

    String suara,nama;
    int lebarPipi;
    public Bulldog(String nama,String suara,int lebarPipi,int position, int averageLength) {
        super(position, averageLength);
        this.nama = nama;
        this.suara = suara;
        this.lebarPipi = lebarPipi;
    }

    @Override
    public void move() {
        super.position += super.averageLength;
    }

    @Override
    public void describe() {
        System.out.println("Nama :"+nama);
        System.out.println("Suara :"+suara);
        System.out.println("Lebar Pipi :"+lebarPipi);
        dogDescribe();
    }
    
}
class GermanShepherd extends Dog implements ISesuatu{

    String suara,nama;
    public GermanShepherd(String nama,String suara,int position, int averageLength) {
        super(position, averageLength);
        this.nama = nama;
        this.suara = suara;

    }

    @Override
    public void move() {
        super.position += super.averageLength;
    }

    @Override
    public void describe() {
        System.out.println("Nama :"+nama);
        System.out.println("Suara :"+suara);
        dogDescribe();
    }
    
}

class Smartphone implements ISesuatu {
    int price;
    String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Smartphone Berpindah");
    }

}
class Car implements ISesuatu {
    int totalForwardGear;
    String color;
    int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("Mobil Sedang Berakselerasi");
    }
   
}

