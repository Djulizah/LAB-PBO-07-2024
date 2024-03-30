public class TP2_2_H071231014 {
    int stock;
    String name;
    String ID;
    int harga;

    // setter
    public void setStock(int newStock){
        stock = newStock;
    }
    public void setname(String newName){
        name = newName;
    }
    public void setID(String newID){
        ID = newID;
    }
    public void setHarga(int newHarga){
        harga = newHarga;
    }
    
    // getter
    public int getStock(){
        return stock;
    }
    public String getname(){
        return name;
    }
    public String getID(){
        return ID;
    }
    public int getHarga(){
        return harga;
    }
    
    public void cekdata(){
        System.out.println("ID    : " + ID);
        System.out.println("Nama  : " + name);
        System.out.println("Harga : Rp." + harga);
    }
    public String cekStock(){
        return (stock > 0)?
        (name + " tersedia sebanyak " + stock + " di stock"):(name + " sudah tidak tersedia");
    }
    
    public static void main(String[] args) {
        TP2_2_H071231014 barang = new TP2_2_H071231014();
        barang.setname("Pulpen");
        barang.setID("081105");
        barang.setHarga(3000);
        barang.setStock(30);

        barang.cekdata();
        System.out.println(barang.cekStock());
    }
    
}