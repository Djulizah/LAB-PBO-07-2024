import java.util.Scanner;

public class TP1_1_H071231084{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, bulat = 0, desimal = 0;

        try {
            System.out.print("Masukkan banyak bilangan: ");
            n = input.nextInt();
            for (int i = 0; i < n; i++) {
            try {
                int x = input.nextInt();
                bulat ++;
            } catch (Exception des) {
                float y = input.nextFloat();
                desimal ++;
            }               
        }
        
        System.out.println(bulat + " Bilangan bulat");
        System.out.println(desimal + " Bilangan Desimal");
        input.close();

        } catch (Exception bknBil) {
            System.out.println("Masukkan angka!");
        }
    }
}