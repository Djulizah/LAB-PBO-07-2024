package Tugas5.Toko;

public class Produk {
   public String merek;
   public double nomorSeri;
   public int harga;
 
   public double getNomorSeri() {
    return nomorSeri;
}

public Produk (String merek, double nomorSeri, int harga){
    this.merek = merek;
    this.nomorSeri = nomorSeri;
    this.harga = harga;
    }
   
   public void displayInfo(){
    System.out.println("Merek: " + merek);
    System.out.println("Nomor Seri: " + nomorSeri);
    System.out.println("Harga: $" + harga);
   }
}

class Smartphone extends Produk{
    double layar;
    int penyimpanan;

    public Smartphone(String merek, double nomorSeri, int harga, double layar, int penyimpanan){
        super(merek, nomorSeri, harga);
        this.layar = layar;
        this.penyimpanan = penyimpanan;

    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Ukuran layar: " + layar + " inch");
        System.out.println("Penyimpanan: " + penyimpanan + " GB");

    }
}

class Kamera extends Produk{
    int resolusi;
    String tipelensa;

    public Kamera(String merek, double nomorSeri, int harga, int resolusi, String tipelensa){
        super(merek, nomorSeri, harga);
        this.resolusi = resolusi;
        this.tipelensa = tipelensa;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Resolusi: " + resolusi + " MP");
        System.out.println("Tipe Lensa: " + tipelensa);
    }

}

class Laptop extends Produk{
    String processor;
    int ram;

    public Laptop(String merek, double nomorSeri, int harga, String processor, int ram ){
        super(merek, nomorSeri, harga);
        this.processor = processor;
        this.ram = ram;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
    }
}