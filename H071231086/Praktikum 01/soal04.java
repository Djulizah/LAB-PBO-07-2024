import java.util.Scanner;
public class soal04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;
        System.out.print("Apa yang Diketahui?\n1. Diameter\n2. Jari-jari\n  ");
        int pilihan = input.nextInt();
        switch (pilihan){
            case 1:
                try {
                    System.out.print(" Masukkan diameter lingkaran : ");
                    double d = input.nextDouble();
                    double luas = (1.0/4) * PI * (d*d);
                    System.out.printf("Luas lingkaran : %.2f", luas); 
                } catch (Exception e){
                    System.out.println("Masukkan angka");
                    System.exit(1);
                }
                break;
            case 2:
                try {
                    System.out.print("Masukkan Jari-jari lingkaran : ");
                    double r = input.nextDouble();
                    double luas = PI * (r*r);
                    System.out.printf("Luas lingkaran : %.2f", luas);
                } catch (Exception e){
                    System.out.println("Masukkan");
                    System.exit(1);
                }
                break;
        }
        input.close();
    }

}