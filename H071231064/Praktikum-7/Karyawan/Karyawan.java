public class Karyawan extends Kehidupan {
    String nama, jabatan;
    int umur;
    double gaji;
    Pengalaman pengalaman;

    public Karyawan(String nama, String jabatan, int umur, double gaji, Pengalaman pengalaman) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.umur = umur;
        this.gaji = gaji;
        this.pengalaman = pengalaman;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJabatan() {
        return jabatan;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    @Override
    void prosesKehidupan() {
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Umur: " + umur);
        System.out.println("Gaji: " + gaji);
        System.out.println("Pengalaman Sebelumnya: " + pengalaman.getPengalamanSebelumnya());

        if (pengalaman instanceof Pendidikan) {
            Pendidikan pendidikan = (Pendidikan) pengalaman;
            System.out.println("Pendidikan Terakhir: " + pendidikan.getPendidikanTerakhir());
        }

        if (pengalaman instanceof Projek) {
            Projek projek = (Projek) pengalaman;
            System.out.println("Jumlah Projek: " + projek.getJumlahProjek());
        }
    }
    
}
