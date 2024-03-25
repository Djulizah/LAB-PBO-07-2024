import java.util.Scanner;

public class TP1_2_H071231084 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Judul Film: ");
        String kalimat = input.nextLine();
        String hasil = Judul(kalimat);
        System.out.println(hasil);
        input.close();
    }

    public static String Judul(String kalimat) {
        String judul = "";
        boolean chr = true;

        for (char c : kalimat.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                chr = true;
            } else if (chr) {
                c = Character.toUpperCase(c);
                chr = false;
            } else {
                c = Character.toLowerCase(c);
            }
            judul += c;
        } return judul;
    }
}