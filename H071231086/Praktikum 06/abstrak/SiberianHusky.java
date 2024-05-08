package Tugas06.abstrak;
import Tugas06.Dog;

public class SiberianHusky extends Dog {
    public SiberianHusky(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(){
        position += 2;
        System.out.println("Siberian Husky telah bergerak ke sebelah kanan sejauh " + position + " langkah");
    }
    public void describe(){
        System.out.println("Memiliki telinga segitiga dan warna mata mencolok");
    }
    
}
