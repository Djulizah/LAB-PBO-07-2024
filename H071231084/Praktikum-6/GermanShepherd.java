public class GermanShepherd extends Dog {

    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 3;
        System.out.println("German Shepherd's position after moving: " + position);
    }

    @Override
    void describe() {
        System.out.print("German Shepherd is a smart and brave dog with a strong body and pointy ears. ");
        System.out.println("Their average length is " + averageLength + " cm");
    }
}
