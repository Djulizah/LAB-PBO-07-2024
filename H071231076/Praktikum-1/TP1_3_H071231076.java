import java.util.Scanner;

public class TP1_3_H071231076 {

    static int CekTahun(int tahun){
        if (tahun >= 40){
            return (1900 + tahun);
        } else {
            return (2000 + tahun);
        }
    }
    
    static String CekBulan(int bulanAwal) {
        String Namabulan;
        switch (bulanAwal) {
            case 1 -> Namabulan = "Januari";
            case 2 -> Namabulan = "Februari";
            case 3 -> Namabulan = "Maret";
            case 4 -> Namabulan = "April";
            case 5 -> Namabulan = "Mei";
            case 6 -> Namabulan = "Juni";
            case 7 -> Namabulan = "Juli";
            case 8 -> Namabulan = "Agustus";
            case 9 -> Namabulan = "September";
            case 10 -> Namabulan = "Oktober";
            case 11 -> Namabulan = "November";
            case 12 -> Namabulan = "Desember";
            default -> Namabulan = "Invalid";
        }
        return Namabulan;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String tanggal = input.nextLine();
        String[] pisah = tanggal.split("-");
        if (validasiTanggal(pisah)) {
            konversiString(pisah);
        } else {
            System.out.println("Tanggal tidak valid");
        }
        input.close();
    }

    static boolean validasiTanggal(String[] hasil) {
        int tanggal = Integer.parseInt(hasil[0]);
        int bulan = Integer.parseInt(hasil[1]);
        int tahun = Integer.parseInt(hasil[2]);
        
        if (bulan < 1 || bulan > 12)
            return false;

        if (tanggal < 1)
            return false;

        if (bulan == 2) { // Februari
            if (tanggal > 29)
                return false;
            if (tanggal == 29 && !isTahunKabisat(tahun))
                return false;
        } else if (tanggal > 31) {
            return false;
        } else if ((bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) && tanggal > 30) {
            return false;
        }
        return true;
    }
    
    static boolean isTahunKabisat(int tahun) {
        return (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);
    }

    static void konversiString(String[] hasil){
        int tanggal = Integer.parseInt(hasil[0]);
        int bulanAwal = Integer.parseInt(hasil[1]);
        int tahunAwal = Integer.parseInt(hasil[2]);
        int tahun = CekTahun(tahunAwal);
        String bulan = CekBulan(bulanAwal);
        System.out.println(tanggal + " " + bulan + " " + tahun);
    }
}
