public abstract class Dog {
    int position;
    int averageLength;
    
    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    public abstract void describe();

    public void dogDescribe(){
        System.out.println("Position :"+position);
        System.out.println("Panjang Rata :"+averageLength);
    }
}
