package Tugas06.abstrak;

import Tugas06.Dog;

public class GermanShepherd extends Dog {
    public GermanShepherd(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(){
        position += 3;
        System.out.println("German Shepherd telah bergerak ke sebelah kanan sejauh " + position + " langkah");
    }
    public void describe(){
        System.out.println("Memiliki tubuh kokoh dan bulu tebal");
    }
    
}
