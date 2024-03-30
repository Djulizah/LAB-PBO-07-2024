package Tugas2;

class data {
    int id;
    String nama;
    int stock;
    int harga;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public String StockStatus(){
        return (stock < 1) ?
        "Stock habis!"  : "Jumlah stock sekarang ada " + stock;
    }


    public void printInfo(){
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Stok: " + stock);
        System.out.println("Harga: " + harga);
        System.out.println(StockStatus());
    }

    public static void main(String[] args) {
        data Susu = new data();
        Susu.setId(1);
        Susu.setNama("Susu");
        Susu.setStock(25);
        Susu.setHarga(4500);

        data Kopi = new data();
        Kopi.setId(2);
        Kopi.setNama("Kopi");
        Kopi.setStock(0);
        Kopi.setHarga(3000);

        Susu.printInfo();
        Kopi.printInfo();


    }

}
