package Tugas2;

class Cuboid {    
    double height;
    double width;
    double length;

    double getVolume() {
        return length * width * height;
    }
}

public class soal03 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 15; 
        cuboid.width = 10;  
        cuboid.length = 30; 

        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}

