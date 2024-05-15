package Tugas06;

public abstract class Dog implements Move {
    protected int position;
    protected int averageLength;

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }
    
    public abstract void move();
    public abstract void describe();
}