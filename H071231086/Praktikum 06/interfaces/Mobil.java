package Tugas06.interfaces;

import Tugas06.Move;

public class Mobil implements Move{
    int totalForwardGear;
    String color;
    int speed;

    public int getTotalForwardGear() {
        return totalForwardGear;
    }
    public String getColor() {
        return color;
    }
    public int getSpeed() {
        return speed;
    }
    public Mobil(int totalForwardGear, String color, int speed){
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.speed = speed;
    }
    public void move(){
        System.out.println("Mobil sedang berakselerasi");
    }
    
}
