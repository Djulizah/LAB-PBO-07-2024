/**
 * TP3_1_H071231064
 */
// import java.util.Scanner;
public class TP3_1_H071231064 {

    public static void main(String[] args) {
        Molekul silicon = new Molekul("Silicon", 2); 
        Molekul carbon = new Molekul("Carbon", 1);
        Batu obsidian = new Batu("Obsidian", silicon, 3.2, 4); 
        Batu bara = new Batu("Batu Bara", carbon, 3.2, 0.8); 


        System.out.println("Batu Yang Tidak Terlempar Adalah : "+ bara.compareBatu(obsidian).getNamaBatu());
        bara.doesFloat();
        obsidian.doesFloat();

    }
}

class Batu {

    private String namaBatu;
    private Molekul molekul;
    private double ukuran;
    private double berat;
    
    public Batu(String namaBatu, Molekul molekul, double ukuran, double berat) {
        this.namaBatu = namaBatu;
        this.molekul = molekul;
        this.ukuran = ukuran;
        this.berat = berat;
    }

    public Batu() {
    }

    public String getNamaBatu() {
        return namaBatu;
    }
    public void setNamaBatu(String namaBatu) {
        this.namaBatu = namaBatu;
    }
    public Molekul getMolekul() {
        return molekul;
    }
    public void setMolekul(Molekul molekul) {
        this.molekul = molekul;
    }
    public double getUkuran() {
        return ukuran;
    }
    public void setUkuran(double ukuran) {
        this.ukuran = ukuran;
    }
    public double getBerat() {
        return berat;
    }
    public void setBerat(double berat) {
        this.berat = berat;
    }

    public Batu compareBatu(Batu lawan) {
        double kepadatanBatu = this.berat * this.molekul.getKepadatanMolekul();
        double KepadatanBatuLawan = lawan.getBerat() * lawan.getMolekul().getKepadatanMolekul();
        
        if (kepadatanBatu < KepadatanBatuLawan) {
            return lawan;
        } else {
            return this;
        }
    }

    public void doesFloat() {
        double density = this.berat / this.ukuran; 
        if (density <= 1) { 
            System.out.println(this.namaBatu + " Mengambang di air.");
        } else {
            System.out.println(this.namaBatu + " Tidak Mengambang di air.");
        }
    }

}

class Molekul {
    private String namaMolekul;
    private int kepadatanMolekul;

    public Molekul(String namaMolekul, int kepadatanMolekul) {
        this.namaMolekul = namaMolekul;
        this.kepadatanMolekul = kepadatanMolekul;
    }
    
    public Molekul() {
    }

    public String getNamaMolekul() {
        return namaMolekul;
    }
    public void setNamaMolekul(String namaMolekul) {
        this.namaMolekul = namaMolekul;
    }
    public int getKepadatanMolekul() {
        return kepadatanMolekul;
    }
    public void setKepadatanMolekul(int kepadatanMolekul) {
        this.kepadatanMolekul = kepadatanMolekul;
    }
    

    
}