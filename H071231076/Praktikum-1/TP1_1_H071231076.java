import java.util.Scanner;

public class TP1_1_H071231076 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Int = 0;
        int Double = 0;

        try {
            System.out.print("");
            int n = input.nextInt();
            System.out.print("");
            for (int i = 0; i < n; i++) {
                if (input.hasNextInt()) {
                    input.nextInt();
                    Int++;
                } else if (input.hasNextDouble()) {
                    input.nextDouble();
                    Double++;
                } else {
                    System.out.println("Input tidak valid, silakan masukkan angka.");
                    input.next();
                    i--;
                }
            }

            System.out.println(Int + " Bilangan Bulat");
            System.out.println(Double + " Bilangan Desimal");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}