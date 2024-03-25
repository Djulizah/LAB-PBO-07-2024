import java.util.Scanner;

public class TP1_3_H071231019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputTanggal = scanner.nextLine();
        System.out.println(ubahTanggal(inputTanggal));
        scanner.close();
    }

    public static String ubahTanggal(String inputTanggal) {
        String[] bagian = inputTanggal.split("-");
    
        int hari = Integer.parseInt(bagian[0]);
        int tahun = Integer.parseInt(bagian[2]);
    
        {if(tahun > 41||tahun == 41) {
            tahun += 1900;
        }else{
            tahun += 2000;
        }
    
        String bulan = ubahBulan(bagian[1]);
    
        return hari + " " + bulan + " " + tahun;}
    }

    private static String ubahBulan(String nomorBulan) {
        String[] bulanBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        int indeksBulan = Integer.parseInt(nomorBulan) - 1; //sesuai dengan indeks, bulan 1 itu indeks 0

        return bulanBulan[indeksBulan];
    }
}