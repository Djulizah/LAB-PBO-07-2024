import java.util.Scanner;
public class TP1_3_H071231084 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tanggal dengan Format DD-MM-YY: ");
        String tanggal = input.next();
        input.close();
        System.out.println(FormatTanggal(tanggal));
    }

    public static String FormatTanggal (String tanggal){
        String hasil = "";
        String tgl = tanggal.substring(0,2);
        if (tanggal.charAt(0) == '0') {
            hasil += tanggal.charAt(1);
        } else {
            hasil += tgl;
        } 

        String bln = tanggal.substring(3, 5);
        switch (bln) {
            case "01":
                hasil += " Januari";
                break;
            case "02":
                hasil += " Februari";
                break;
            case "03":
                hasil += " Maret";
                break;
            case "04":
                hasil += " April";
                break;
            case "05":
                hasil += " Mei";
                break;
            case "06":
                hasil += " Juni";
                break;
            case "07":
                hasil += " Juli";
                break;
            case "08":
                hasil += " Agustus";
                break;
            case "09":
                hasil += " September";
                break;
            case "10":
                hasil += " Oktober";
                break;
            case "11":
                hasil += " November";
                break;
            case "12":
                hasil += " Desember";
                break;
            default:
                break;
        }

        String thn = tanggal.substring(6);
        int tahun = Integer.parseInt(thn);
        if (tahun < 25) {
            hasil += " 20" + thn;
        } else {
            hasil += " 19" + thn;
        }

        return hasil;
    }
}