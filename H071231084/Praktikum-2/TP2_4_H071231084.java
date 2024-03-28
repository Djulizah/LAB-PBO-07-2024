class Alamat{
    String jalan;
    String kota;

    public String AlamatLengkap(){
        return jalan + ", " + kota;
    }
}

class Mahasiswa {
    Alamat alamat;
    String nama;
    String nim;

    public String getAlamat() {
        return alamat.AlamatLengkap();
    }

    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
}

public class TP2_4_H071231084 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Bung";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Khalika Tsabitah Malik";
        mahasiswa.nim = "H071231084";

        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("NIM\t: " + mahasiswa.getNim());
        System.out.println("Alamat\t: " + mahasiswa.getAlamat());
    }
}