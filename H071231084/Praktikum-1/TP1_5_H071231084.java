import java.util.Scanner;

public class TP1_5_H071231084 {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3}, {4,5,6}, {7,8,9}};
        Scanner input = new Scanner(System.in);
        
        try {
        int x = input.nextInt();
        input.close();
        boolean found = false;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                if (nums[i][j] == x) {
                    System.out.println(String.format("Found %d at [%d][%d]", x, i, j));
                    found = true;
                }
            }
        }
        if (!found){
            System.out.println(x + " not Found");
        }
        } catch (Exception e) {
            System.out.println("Masukkan Angka!");
        }
    }    
}