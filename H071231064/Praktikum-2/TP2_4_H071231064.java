public class TP2_4_H071231064 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Antang";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "A.M.Yusran Mazidan";
        mahasiswa.nim = "H071231064";
        mahasiswa.alamat = alamat;

        System.out.println("Nama: " + mahasiswa.nama);
        System.out.println("NIM: " + mahasiswa.nim);
        System.out.println("Alamat: " + mahasiswa.alamat.jalan + ", " + mahasiswa.alamat.kota);
        System.out.println("Alamat: " + mahasiswa.alamat.getAlamat());
    }
}
class Alamat {
    String jalan;
    String kota;
    public String getAlamat(){
        String hasil = jalan + ", "+kota;
        return hasil;
    }
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;
}


