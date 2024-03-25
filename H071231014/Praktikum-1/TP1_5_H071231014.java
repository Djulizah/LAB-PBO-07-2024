import java.util.Scanner;

public class TP1_5_H071231014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            int x = input.nextInt(); 
            int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                if (nums[i][j] == x) {
                    System.out.println("Found " + x + " at [" + i + "][" + j + ']');
                    break;
                }
            }
        }
        }catch(Exception e){
            System.out.println("Input tidak valid");
        }finally{
            input.close();
        }
        
    }
}