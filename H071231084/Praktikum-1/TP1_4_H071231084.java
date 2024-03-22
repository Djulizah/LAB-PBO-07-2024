import java.util.Scanner;

public class TP1_4_H071231084 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
        System.out.print("Masukkan Jari-jari Lingkaran: ");
        double r = input.nextDouble();
        input.close();
        double hasil = LuasLingkaran(r); 
        System.out.print("Luas Lingkaran: ");
        System.out.printf("%.2f", hasil);
    } catch (Exception e) {
        System.out.print("Masukkan Angka!"); }
    }

    public static double LuasLingkaran (double r){
        double PI = 3.1415;
        double luas = PI * r * r;
        return luas;
    }
}