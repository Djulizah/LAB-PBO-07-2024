public class Bulldog extends Dog {

    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 1;
        System.out.println("Bulldog's position after moving: " + position);
    }

    @Override
    void describe() {
        System.out.print("Bulldog is a dog with a short face and wrinkles on its nose. ");
        System.out.println("Their average length is " + averageLength + " cm");
    }
}
