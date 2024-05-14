import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Kehidupan extends Karyawan {
    static int poin = 0;
    abstract void prosesKehidupan();
    Scanner in = new Scanner(System.in);

    int getInput() {
        boolean input = false;
        int inputan = 0;
        while (!input) {
            try {
                System.out.print("Input: ");
                inputan = in.nextInt();
                if (inputan > 0 && inputan < 5) {
                    input = true;
                } else {
                    System.out.println("Inputan tidak valid! Pilih angka yang sesuai!");
                }    
            } catch (InputMismatchException e) {
                System.out.println("Inputan tidak valid! Inputan harus berupa angka!");
                in.nextLine();
            }
        }
        return inputan;
    }
}