package Tugas06.abstrak;

import Tugas06.Dog;

public class Bulldog extends Dog {
    public Bulldog(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(){
        position += 1;
        System.out.println("Bulldog telah bergerak ke sebelah kanan sejauh " + position + " langkah");
    }
    public void describe(){
        System.out.println("Kepala besar dan bertubuh pendek");
    }
    
}