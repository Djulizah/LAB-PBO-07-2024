import java.util.Scanner;

public class soal01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahBilanganBulat = 0, jumlahBilanganDesimal = 0;
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            try {
                double bilangan = input.nextDouble();

                if (bilangan == (int) bilangan) {
                    jumlahBilanganBulat++;
                } else {
                    jumlahBilanganDesimal++;
                }
            } catch (Exception e) {
                input.next();
                System.out.println("Input bukan angka.");
            }
        }

        input.close();

        System.out.println(jumlahBilanganBulat + " Bilangan Bulat");
        System.out.println(jumlahBilanganDesimal + " Bilangan Desimal");
    }
}
