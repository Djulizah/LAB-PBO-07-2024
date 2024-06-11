package Tugas7;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Karyawan> listKaryawan = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    public static void runApp() {
        System.out.println("Data Karyawan");
        System.out.println("a. Tambah Data Karyawan");
        System.out.println("b. Tampilkan Detail Karyawan");
        System.out.println("c. Keluar ");
        System.out.print("Pilih opsi (a-c): ");

        String selectMenu = sc.nextLine();
        switch (selectMenu) {
            case "a":
                tambahKaryawan();
                break;
            case "b":
                tampilkanDetailKaryawan();
                break;
            case "c":
                System.out.println("Selamat Tinggal!");
                return;
            default:
                System.out.println("Opsi tidak valid. Silakan pilih lagi.");
                runApp();
                break;
        }
    }

    private static void tambahKaryawan() {
        try {
            System.out.print("Masukkan Nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan Umur: ");
            int umur = Integer.parseInt(sc.nextLine());

            System.out.println("Status : ");
            Keluarga.status();
            int status = Integer.parseInt(sc.nextLine());

            System.out.println("Organisasi: ");
            Karyawan.organisasi();
            int organisasi = Integer.parseInt(sc.nextLine());

            
            System.out.print("Jenis Pekerjaan (1-4): ");
            Pengalaman.jenisPekerjaan(); // Asumsi: metode ini mencetak jenis pekerjaan
            int pengalamanKerja = Integer.parseInt(sc.nextLine());

            System.out.println("Gaji Sebelumnya: ");
            double gaji = sc.nextDouble();

            Scanner sc = new Scanner(System.in);
            System.out.print("Pendidikan Terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
            String pendidikan = sc.nextLine();

            System.out.print("Banyaknya Projek (1-4): ");
            Projek.banyakProjek(); // Asumsi: metode ini mencetak banyak projek
            int projek = Integer.parseInt(sc.nextLine());

            String jumlahProjek;
            if (projek == 1) {
                jumlahProjek = "Jumlah Projek IT: 4";
            } else if (projek == 2) {
                jumlahProjek = "Jumlah Projek IT: 8";
            } else if (projek == 3) {
                jumlahProjek = "Jumlah Projek IT: 12";
            } else {
                jumlahProjek = "Jumlah Projek IT: Lebih dari 15";
            }

            if (pendidikan.equals("SD") || pendidikan.equals("SMP") || projek == 1 || umur <= 18 || organisasi == 2) {
                System.out.println("Karyawan Tidak Memenuhi Syarat.");
                Sound.Sound2(); // Asumsi: metode ini menampilkan atau memainkan suara
                runApp();
            } else {
                Karyawan karyawan = new Karyawan(nama, umur, gaji );
                listKaryawan.add(karyawan);
                System.out.println("Pengalaman sedang diproses.....");
                System.out.println("Pendidikan Terakhir: " + pendidikan);
                System.out.println(jumlahProjek);
                System.out.println("-----------------------");
                System.out.println("Selamat, Karyawan diterima!!");
                System.out.println("-----------------------");
                Sound.Sound1();
                runApp();
                
            }
        } catch (NumberFormatException e) {
            System.out.println("Input umur atau projek tidak valid. Harap masukkan angka.");
        }
    }

    private static void tampilkanDetailKaryawan() {
        if (listKaryawan.isEmpty()) {
            System.out.println("Belum ada data karyawan.");
        } else {
            for (Karyawan karyawan : listKaryawan) {
                System.out.println("Nama: " + karyawan.getNama());
                System.out.println("Umur: " + karyawan.getUmur());
                System.out.println("Jabatan: " + karyawan.getJabatan());
                System.out.println("Gaji: " + karyawan.getGaji());
            }
        }
        runApp();
    }
}
