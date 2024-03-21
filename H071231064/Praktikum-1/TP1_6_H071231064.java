import java.util.Scanner;

public class TP1_6_H071231064 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka faktorial :");
        int n = input.nextInt();
        int fac = factorial(n);
        System.out.println("Faktorial dari " +n+ " = "+fac);
        input.close();
    }

    public static int factorial(int n){
        if (n == 0) {
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
}
