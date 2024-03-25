import java.util.Scanner;
public class TP1_faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int fac = factorial(n);
        System.out.println(String.format("Faktorial dari %d = %d", n, fac));
    }

    public static int factorial(int n){
        if (n <= 1) {
            return n;
        } else {
            return n*factorial(n-1);
            }
        }
}