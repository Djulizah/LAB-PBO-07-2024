import java.util.Scanner;

/**
 * TP1_1_H071231064
 */
class TP1_3_H071231064 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input: ");
        
        String raw = in.nextLine();

        System.out.println(formatter(raw));
        in.close();

    }

    static String formatter(String tanggal){
        String[] pisah = tanggal.split("-");
        int tanggalInt = Integer.parseInt(pisah[0]);
        int bulanAwal = Integer.parseInt(pisah[1]);
        int tahunAwal = Integer.parseInt(pisah[2]);
        int tahun = tahunAwal >= 40 ? (1900 + tahunAwal) : (2000 + tahunAwal);
        String bulan = "";
        switch (bulanAwal){
            case 1:
                bulan = "Januari";
                break;
            case 2:
                bulan = "Februari";
                break;
            case 3:
                bulan = "Maret";
                break;
            case 4:
                bulan = "April";
                break;
            case 5:
                bulan = "Mei";
                break;
            case 6:
                bulan =  "Juni";
                break;
            case 7:
                bulan = "Juli";
                break;
            case 8:
                bulan = "Agustus";
                break;
            case 9:
                bulan = "September";
                break;
            case 10:
                bulan = "Oktober";
                break;
            case 11:
                bulan = "November";
                break;
            case 12:
                bulan = "Desember";
                break;
        }
        return tanggalInt + " " + bulan + " " + tahun;
    }
    

    
    
}