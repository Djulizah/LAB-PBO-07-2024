public class Pitbull extends Dog {

    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 3;
        System.out.println("Pitbull's position after moving: " + position);
    }

    @Override
    void describe() {
        System.out.print("Pitbull is a strong and intelligent dog with a big head. ");
        System.out.println("Their average length is " + averageLength + " cm");
    }
}
