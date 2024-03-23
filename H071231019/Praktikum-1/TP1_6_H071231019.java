import java.util.Scanner;

public class TP1_6_H071231019 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fac = factorial(n);
        System.out.println("Faktorial dari " + n + " = " +fac);

        }
        public static int factorial (int n) {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
}