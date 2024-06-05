package TP7;

public class Karyawan extends Pengalaman implements Pendidikan, Projek, Keluarga {
    private String nama;
    private String jabatan;
    private int umur;
    private int gaji;

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

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    @Override
    public String levelPendidikan(String tingkat) {
        switch (tingkat) {
            case "SD":
                return "Pendidikan Dasar";
            case "SMP":
                return "Pendidikan Menengah Pertama";
            case "SMA":
                return "Pendidikan Menengah Atas";
            case "D3":
                return "Diploma 3";
            case "S1":
                return "Sarjana";
            case "S2":
                return "Magister";
            case "S3":
                return "Doktor";
            default:
                return "Tidak Valid";
        }
    }

    @Override
    public int pengalamanProjek(int durasi) {
        switch (durasi) {
            case 4:
                return 15;
            case 3:
                return 12;
            case 2:
                return 8;
            case 1:
                return 4;
            default:
                return 0;
        }
    }

    @Override
    public String statusPernikahan(String status) {
        switch (status) {
            case "sudah":
                return "Sudah Menikah";
            case "belum":
                return "Belum Menikah";
            default:
                return "Data Kosong";
        }
    }
}
