import java.util.Scanner;

public class TP1_6_H071231014 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fac = factorial(n);
        System.out.println("Faktorial dari " + n + " = " +fac);
        scanner.close();
        }
        public static int factorial (int n) {
            if(n <= 1){
                return 1;
            }else{
                return n * factorial(n-1);
            }
        }
        
}
