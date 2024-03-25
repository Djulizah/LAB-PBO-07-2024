import java.util.Scanner;

public class TP1_4_H071231064 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double PI = 3.14;      
        System.out.println("Program Menghitung Luas Lingkaran !");
        System.out.print("Masukkan Jari-jari : ");
        while (true) {
            try {
                double r = input.nextDouble();
                double luas = PI * (r*r);
                System.out.printf("Luasnya adalah : %.2f", luas);
                break;
            } catch (Exception e){
                System.out.println("Bukan Angka! Silakan coba lagi.");
                System.out.print("Masukkan Jari-jari : ");
                input.next(); 
            }
        }
        input.close();
    }
}
