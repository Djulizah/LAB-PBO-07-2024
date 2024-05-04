public abstract class Dog implements Entity {
    int position, averageLength;
    
    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }
    
    abstract void describe();
}