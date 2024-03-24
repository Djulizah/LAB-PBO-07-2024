import java.util.Scanner;

public class TP1_1_H071231014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bilinteger = 0;
        int bildesimal = 0;

        try {
            int barispertama = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < barispertama; i++) {
                String input = scanner.next();
                try {
                    double number = Double.parseDouble(input);
                    if (number % 1 == 0) {
                        bilinteger++;
                    } else {
                        bildesimal++;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Input tidak valid");
                    return;
                }
            }

            System.out.println(bilinteger + " Bilangan Bulat");
            System.out.println(bildesimal + " Bilangan Desimal");
            System.exit(0);
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid");
        } finally {
            scanner.close();
        }
    }
}