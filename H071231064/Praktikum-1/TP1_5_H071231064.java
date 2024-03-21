import java.util.Scanner;

public class TP1_5_H071231064 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        while (true) {
            try {
                System.out.print("Masukkan angka yang dicari: ");
                int dicari = input.nextInt();
                String hasil = cariAngka(nums, dicari);
                if (hasil != null) {
                    System.out.println(hasil);
                } else {
                    System.out.println("Angka tidak ditemukan!");
                }
                break;
            } catch (Exception e) {
                System.out.println("Input bukan angka! Silakan coba lagi.");
                input.next();
            }
        }
        input.close();
    }

    static String cariAngka(int[][] nums, int dicari) {
        for (int x = 0; x < nums.length; x++) {
            for (int y = 0; y < nums[x].length; y++) {
                if (nums[x][y] == dicari) {
                    return "Found " + dicari + " at [" + x + "][" + y + "]";
                }
            }
        }
        return null;
    }
}
