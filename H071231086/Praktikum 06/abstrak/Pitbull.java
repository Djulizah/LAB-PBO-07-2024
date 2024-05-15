package Tugas06.abstrak;
import Tugas06.Dog;

public class Pitbull extends Dog {
    public Pitbull(int position, int averageLength){
        super(position, averageLength);
    }
    public void move(){
        position += 3;
        System.out.println("Pitbull telah bergerak ke sebelah kanan sejauh " + position + " langkah");
    }
    public void describe(){
        System.out.println("Bulu pendek dan tubuh berotot");
    }
    
}
