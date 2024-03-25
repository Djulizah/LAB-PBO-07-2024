import java.util.Scanner;
public class faktorial{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fac = factorial(n);
        System.out.println("Faktorial dari " + n + " = " +fac);
        scanner.close();
    }
    public static int factorial (int n) {
        if (n == 0 || n == 1){
            return 1;
        } else {
            return n * factorial(n-1); 
        }

    }
}