class Alamat {
    String jalan;
    String kota;
    String getAlamatLengkap() {
        return jalan + ", " + kota;
    }
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;
    
    String getNama() {
        return nama;
    }

    String getNim() {
        return nim;
    }
    
    String getAlamat() {
        return alamat.getAlamatLengkap();    
    }
}
public class TP2_4_H071231014 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Jl.Perintis Kemerdekaan 7";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Musliati";
        mahasiswa.nim = "H071231014";

        System.out.println("Nama    : " + mahasiswa.getNama());
        System.out.println("Nim     : " + mahasiswa.getNim());
        System.out.println("Alamat  : " + mahasiswa.getAlamat());
    }
}