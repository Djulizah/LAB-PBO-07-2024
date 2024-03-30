public class TP2_2_H071231064 {
    public static void main(String[] args) {
        Produk susu = new Produk("1", "Susu", 50, 20000);
        Produk telur = new Produk("2", "Telur", 100, 30000);
        Produk beras = new Produk("3", "Beras", 0, 100000);

        cetakInfoProduk(susu);
        cetakInfoProduk(telur);
        cetakInfoProduk(beras);
    }

    public static void cetakInfoProduk(Produk produk) {
        System.out.println("ID: " + produk.getId());
        System.out.println("Nama: " + produk.getNama());
        System.out.println("Stok: " + produk.getStok());
        System.out.println("Harga: " + produk.getHarga());
        produk.cekKetersediaan();
        System.out.println();
    }
}

/**
* Produk
     */
class Produk {
    String id;
    String nama;
    int stok;
    double harga;

    Produk(String id, String nama, int stok, double harga) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public double getHarga() {
        return harga;
    }

    public void cekKetersediaan() {
        System.out.println("Jumlah stok: " + stok);
        if(stok > 0) {
            System.out.println("Produk tersedia.");
        } else {
            System.out.println("Produk tidak tersedia.");
        }
    }
    
    
}









































// import java.util.Scanner;

// public class TP2_2_H071231064 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Masukkan ID produk: ");
//         String id = scanner.nextLine();

//         System.out.println("Masukkan nama produk: ");
//         String nama = scanner.nextLine();

//         System.out.println("Masukkan jumlah stok: ");
//         int stok = scanner.nextInt();

//         System.out.println("Masukkan harga produk: ");
//         double harga = scanner.nextDouble();

//         Produk produkBaru = new Produk(id, nama, stok, harga);

//         cetakInfoProduk(produkBaru);
//     }

//     public static void cetakInfoProduk(Produk produk) {
//         System.out.println("ID: " + produk.getId());
//         System.out.println("Nama: " + produk.getNama());
//         System.out.println("Stok: " + produk.getStok());
//         System.out.println("Harga: " + produk.getHarga());
//         produk.cekKetersediaan();
//         System.out.println();
//     }
// }
