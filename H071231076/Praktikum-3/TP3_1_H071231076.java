class Tempat {
    private String nama;

    public Tempat(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Pemain {
    private String nama;
    private boolean sedangBersembunyi;
    private Tempat tempat;
    private Tempat tempatSembunyi;

    public Pemain(String nama, Tempat tempat) {
        this.nama = nama;
        this.sedangBersembunyi = false;
        this.tempat = tempat;
    }

    public Pemain(String nama, boolean sedangBersembunyi, Tempat tempatSembunyi) {
        this.nama = nama;
        this.sedangBersembunyi = sedangBersembunyi;
        this.tempatSembunyi = tempatSembunyi;
        this.tempat = tempatSembunyi;
    }

    public void sembunyi(Tempat tempat) {
        sedangBersembunyi = true;
        this.tempat = tempat;
        System.out.println(nama + " sedang bersembunyi di " + tempat.getNama());
    }

    public void cari(Pemain pemain) {
        if (sedangBersembunyi) {
            System.out.println(nama + " sedang mencari " + pemain.getNama() + " di " + tempatSembunyi.getNama());
            if (pemain.sedangBersembunyi && tempatSembunyi.getNama().equals(pemain.tempat.getNama())) {
                System.out.println(pemain.getNama() + " ditemukan di " + tempat.getNama());
                System.out.println("--------------------PERMAINAN SELESAI------------------");
            } else {
                System.out.println(pemain.getNama() + " tidak ditemukan di " + tempatSembunyi.getNama());
            }
        }
    }

    public String getNama() {
        return nama;
    }

    public boolean isSedangBersembunyi() {
        return sedangBersembunyi;
    }

    public Tempat getTempat() {
        return tempat;
    }

    public Tempat getTempatSembunyi() {
        return tempatSembunyi;
    }
}

public class Main {
    public static void main(String[] args) {
        Tempat hutan = new Tempat("Hutan");
        Tempat taman = new Tempat("Taman");
        Tempat gua = new Tempat("Gua");

        Pemain pemain1 = new Pemain("Pemain 1", hutan);
        Pemain pemain2 = new Pemain("Pemain 2", true, taman);

        System.out.println("------------------PEMAIN BERSEMBUNYI---------------------");
        System.out.println(pemain2.getNama() + " sedang menghitung 1 sampai 10");
        pemain1.sembunyi(hutan);
        System.out.println("-------------------PEMAIN MENCARI------------------------");
        pemain2.cari(pemain1);
    }
}
