class Alamat {
    String jalan;
    String kota;
}

class Mahasiswa {
    Alamat alamat;
    String nama;
    String nim;

    void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    void setNim(String nim) {
        this.nim = nim;
    }

    String getNama() {
        return nama;
    }

    String getNim() {
        return nim;
    }

    String getAlamat() {
        return alamat.jalan + ", " + alamat.kota;
    }
}

public class TP2_4_H071231076 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Jalan Bonto Bila 5";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setAlamat(alamat);
        mahasiswa.setNama("Adrian Tri Putra");
        mahasiswa.setNim("H071231076");

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}
