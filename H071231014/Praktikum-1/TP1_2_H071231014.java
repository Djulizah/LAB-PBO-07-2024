import java.util.Scanner;

public class TP1_2_H071231014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Judul Film : ");
        String judul = input.nextLine();
        String Hasil = titleConvert(judul);
        System.out.println(Hasil);
        input.close();
    }
    public static String titleConvert(String judul){
        String[] kataKata = judul.split(" ");
        String akhir="";
        for (String kata : kataKata){
            String kapital = kata.substring(0, 1).toUpperCase();
            String sisanya = kata.substring(1).toLowerCase();
            akhir += kapital + sisanya +" ";
        }
        return akhir;
    }
}