import java.util.Scanner;

/**
 * TP1_1_H071231064
 */
class TP1_2_H071231064 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan Judul Film : ");
        String judul = in.nextLine();
        System.out.println(kapitalisasi(judul));
        in.close();
    }

    static String kapitalisasi(String kalimat){
        String[] arr_kalimat = kalimat.split(" ");
        for (int i = 0; i < arr_kalimat.length; i++) {
            arr_kalimat[i] = Character.toUpperCase(arr_kalimat[i].charAt(0)) + arr_kalimat[i].substring(1).toLowerCase();
        }
    
        return String.join(" ", arr_kalimat);
    }
    
}