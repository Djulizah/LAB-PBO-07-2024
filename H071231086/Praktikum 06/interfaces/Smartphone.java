package Tugas06.interfaces;

import Tugas06.Move;

public class Smartphone implements Move{
    public int price;
    public String brand;

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public Smartphone(int price, String brand){
        this.price = price;
        this.brand = brand;
    }

    public void move(){
        System.out.println("Smartphone berpindah");
    }
}
