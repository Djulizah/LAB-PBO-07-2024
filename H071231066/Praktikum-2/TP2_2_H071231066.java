package Pertemuan2;
public class TP2_2_H071231066{
    public static void main(String[] args){
        Produk produk1 = new Produk();
        produk1.ID = "S1231";
        produk1.nama = "Kecap Bango";
        produk1.harga = 12000;
        produk1.stok = 78;

        produk1.cekDataProduk();
        produk1.cekProduk();
    }
}
class Produk{
    String ID, nama;
    int stok;
    double harga;

    void cekDataProduk(){
        System.out.println("DATA PRODUK");
        System.out.println("Nama        : " + nama);
        System.out.println("ID Produk   : " + ID);
        System.out.println("Stok        : " + stok);
        System.out.printf("Harga       : Rp. %.2f\n", harga);
    }

    void cekProduk(){
        if (stok == 0){
            System.out.println("Tidak Tersedia");
        } else {
            System.out.println("Stok tersedia : "+ stok);
        }
    }
}