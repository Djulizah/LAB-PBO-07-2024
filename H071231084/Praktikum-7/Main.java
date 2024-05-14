import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static ArrayList<Karyawan> listKaryawan = new ArrayList<>();
    public static void main(String[] args) {
        mainMenu();        
    }

    static void mainMenu() {
        batas();
        System.out.println("Data Karyawan: ");
        System.out.println("a. Tambah data karyawan");
        System.out.println("b. Tampilkan detail karyawan");
        System.out.println("c. Keluar");
        System.out.print("Pilih opsi (a-c): ");
        char pilihan = in.next().charAt(0);
        batas();
        switch (pilihan) {
            case 'a':
                tambahKaryawan();
                mainMenu();
                break;
            case 'b':
                detailKaryawan();
                mainMenu();
                break;
            case 'c':
                System.out.println("Selamat Tinggal!");
                break;
            default:
                System.out.println("Masukkan pilihan yang tepat!");
                mainMenu();
                break;
        }
    }

    static void tambahKaryawan() {
        Karyawan karyawan = new Karyawan();
        System.out.print("Masukkan nama: ");
        karyawan.setNama(in.next());
        System.out.print("Masukkan umur: ");
        boolean validInput = false;
        int umur = 0;
        while (!validInput) {
            try {
                umur = in.nextInt();
                if (umur < 0) {
                    System.out.println("Masukkan umur yang tepat!");
                    System.out.print("Masukkan umur: ");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Inputan harus dalam bentuk angka!");
                in.nextLine();
                System.out.print("Masukkan umur: ");
            }    
        }
        karyawan.setUmur(umur);
        batas();
        Keluarga keluarga = new Keluarga();
        keluarga.prosesKehidupan();
        batas();
        Pendidikan pendidikan = new Pendidikan();
        pendidikan.prosesKehidupan();
        batas();
        Pengalaman pengalaman = new Pengalaman();
        pengalaman.prosesKehidupan();
        batas();
        pengalaman.Organisasi();
        batas();
        Projek projek = new Projek();
        projek.prosesKehidupan();
        batas();
        
        if (Kehidupan.poin > 2 && karyawan.umur > 17) {
            System.out.println("Pengalaman sedang diproses...");
            System.out.println("Pendidikan terakhir: " + pendidikan.pendTerakhir);
            System.out.println("Jumlah projek IT: " + projek.jumlahProjek);
            batas();
            CheckSound.playMusic("accepted1.wav");
            System.out.println("Selamat, karyawan diterima!");
            CheckSound.playMusic("accepted2.wav");
            karyawan.setJabatan("Karyawan");
            karyawan.setGaji(pengalaman.gaji);
            listKaryawan.add(karyawan);
        } else {
            System.out.println("Karyawan tidak memenuhi syarat!");
            CheckSound.playMusic("rejected.wav");
        }
    }

    static void detailKaryawan() {
        System.out.println("Detail karyawan: ");
        for (Karyawan x : listKaryawan) {
            System.out.println("Nama\t: " + x.getNama());
            System.out.println("Umur\t: " + x.getUmur());
            System.out.println("Jabatan\t: " + x.getJabatan());
            System.out.println("Gaji\t: " + x.getGaji());
            System.out.println("---------------------------------------------------");
        }
    }

    static void batas() {
        System.out.println("===================================================");
    }
}