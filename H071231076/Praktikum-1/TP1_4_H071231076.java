import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double r = scanner.nextDouble();
            
            double area = hitungLuasLingkaran(r);
            System.out.printf("Luas lingkaran: %.2f", area);
        } catch (Exception e) {
            System.out.println("Input harus berupa angka!");
        } finally {
            scanner.close();
        }
    }
    
    public static double hitungLuasLingkaran(double r) {
        double pi = 3.14;
        return pi * r * r;
    }
}
