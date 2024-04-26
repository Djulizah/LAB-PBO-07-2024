class Produk{
    int ID;
    String nama;
    int stok;
    int harga;

    public void printInfo(){
        System.out.println("Nomor ID\t: " + ID);
        System.out.println("Nama produk\t: " + nama);
        System.out.println("Stok\t\t: " + stok);
        System.out.println("Harga\t\t: " + harga);

    }

    public String cekStok(){
        return (stok > 0) ?
        "Stok Tersedia!" : "Stok Kosong!";
    }
}

public class TP2_2_H071231084 {
    public static void main(String[] args) {
        Produk pulpen = new Produk();
        pulpen.ID = 73712345;
        pulpen.nama = "Zebra Sarasa Clip Gel Pen";
        pulpen.stok = 12;
        pulpen.harga = 16000;

        pulpen.printInfo();
        System.out.println(pulpen.cekStok());
        System.out.println("==========================================================");

        Produk pensil = new Produk();
        pensil.ID = 98912345;
        pensil.nama = "Faber Castell Mechanical Click Pencil";
        pensil.stok = 0;
        pensil.harga = 17300;

        pensil.printInfo();
        System.out.println(pensil.cekStok());
        System.out.println("==========================================================");
    }
}