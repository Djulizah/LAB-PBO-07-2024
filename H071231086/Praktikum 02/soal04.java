package Tugas2;

class Alamat {
    String jalan;
    String kota;
    String alamat;

    public String getJalan() {
        return jalan;
    }
    public void setJalan(String jalan) {
        this.jalan = jalan;
    }
    public String getKota() {
        return kota;
    }
    public void setKota(String kota) {
        this.kota = kota;
    }
    public String getAlamat() {
        return jalan +" "+kota;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }


}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public Alamat getAlamat() {
        return alamat;
    }

    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }
}

public class soal04 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.setJalan("Athirah Raya");
        alamat.setKota("Makassar");
        alamat.setAlamat(null);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setAlamat(alamat);
        mahasiswa.setNama("Nailah M");
        mahasiswa.setNim("H071231086");

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.alamat.getAlamat());
    }
}


