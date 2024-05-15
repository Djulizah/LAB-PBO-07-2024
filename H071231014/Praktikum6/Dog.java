abstract class Dog {
    int position;
    int averageLength;

    public Dog(int position, int averageLength){
        this.position = position;
        this.averageLength = averageLength;
    }

    public int getPosition(){
        return this.position;
    }

    abstract void move();
    
    abstract void describe();
}