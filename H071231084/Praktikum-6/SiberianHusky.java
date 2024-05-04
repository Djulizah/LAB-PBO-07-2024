public class SiberianHusky extends Dog {

    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 2;
        System.out.println("Siberian Husky's position after moving: " + position);
    }

    @Override
    void describe() {
        System.out.print("Siberian husky is a tough and fast dog with thick fur and pretty blue eyes. ");
        System.out.println("Their average length is " + averageLength + " cm");
    }
}
