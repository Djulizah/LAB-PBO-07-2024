import java.util.ArrayList;
import java.util.Scanner;
public class TP7_1_H071231064 {
    ArrayList<Karyawan> dataKaryawan = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TP7_1_H071231064 program = new TP7_1_H071231064();
        program.tambahDataKaryawan();
        sc.close();
    }

    void tambahDataKaryawan(){
        System.out.println("Nama:");
        String nama = sc.nextLine();
        System.out.println("Umur:");
        int umur = sc.nextInt();
        sc.nextLine();

        Pengalaman pengalaman = new Pengalaman(inputPengalaman());
        System.out.println("Gaji:");
        double gaji = sc.nextDouble();
        sc.nextLine();

        pengalaman = new Pendidikan(pengalaman.getPengalamanSebelumnya(), inputPendidikan());
        pengalaman = new Projek(pengalaman.getPengalamanSebelumnya(), inputProject());

        System.out.println("Pengalaman Sedang diproses...");
            Pendidikan pendidikan = (Pendidikan) pengalaman;
            Projek projek = (Projek) pengalaman;

            System.out.println("Pendidikan Terakhir: " + pendidikan.getPendidikanTerakhir());
            System.out.println("Jumlah Projek: " + projek.getJumlahProjek());
               
                if (umur < 18 && projek.jumlahProjek != 1 && (pendidikan.pendidikanTerakhir != "SD" || pendidikan.pendidikanTerakhir != "SMP")) {
                    Karyawan baru = new Karyawan(nama, "Staff", umur, gaji, pengalaman);
                    dataKaryawan.add(baru);
                    System.out.println("====================");
                    System.out.println("Karyawan baru berhasil ditambahkan!");
                    System.out.println("====================");
                }
        
    }

    public static String inputPendidikan(){
        System.out.println("Pendidikan Terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
        return sc.nextLine();
    }

    public static String inputPengalaman(){
        System.out.println("Pengalaman Sebelumnya:");
        System.out.println("1. Freelancer");
        System.out.println("2. Magang");
        System.out.println("3. Pekerja Tetap");
        System.out.println("4. Tidak Ada");
        System.out.println("Input: ");
        int pilihan = sc.nextInt();
        String pengalamansebelumnya;
        switch (pilihan) {
            case 1:
                pengalamansebelumnya = "Freelancer";
                break;
                
            case 2:
                pengalamansebelumnya = "Magang";
                break;
        
            case 3:
                pengalamansebelumnya = "Pekerja Tetap";
                break;
        
            case 4:
                pengalamansebelumnya = "Tidak Ada";
                break;
        
            default:
                pengalamansebelumnya = "Tidak Ada";
                break;
        }
        return pengalamansebelumnya;

    }
    public static int inputProject(){
        System.out.println("Projek IT:");
        System.out.println("1. Minimal 4");
        System.out.println("2. Minimal 8");
        System.out.println("3. Minimal 12");
        System.out.println("4. Minimal 15");
        System.out.println("Input: ");
        int pilihan = sc.nextInt();
        return pilihan;
    }
}