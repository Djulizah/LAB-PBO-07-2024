class Cuboid {
    double height;
    double width;
    double length;

    double getVolume(){
        return height * width * length; // hitung volume
    }
}

public class TP2_3_H071231014 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 30; 
        cuboid.width = 10;  
        cuboid.length = 15; 

        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}