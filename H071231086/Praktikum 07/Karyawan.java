package Tugas7;

public class Karyawan {
    String nama;
    int umur;
    String jabatan = "Karyawan";
    double gaji;
    int organisasi;


    public static void organisasi(){
        System.out.println("1. Ada");
        System.out.println("2. Tidak Ada");
        System.out.println("input :");


    }
    public int getOrganisasi() {
        return organisasi;
    }


    public void setOrganisasi(int organisasi) {
        this.organisasi = organisasi;
    }


    public Karyawan(String nama, int umur, String jabatan, double gaji) {
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }


    public Karyawan(String nama, int umur, double gaji) {
        this.nama = nama;
        this.umur = umur;
        this.gaji = gaji;
    }
   

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    


    
}
