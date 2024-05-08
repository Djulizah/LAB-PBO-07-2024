package Tugas5.Bangun;

public class BangunRuang {
    double volume;
    double luas;

    public void volume(){

    }
    
    public void luas(){

    }
}

class kubus extends BangunRuang{
    static double sisi;

    public void volume(){
        volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus: " + volume);
    }

    public void luas(){
        luas = 6 * sisi * sisi;
        System.out.println("Luas Kubus: " + luas);
    }
}

class balok extends BangunRuang{
    double panjang;
    double tinggi;
    double lebar;


    public void volume(){
        volume = panjang * lebar * tinggi;
        System.out.println("Volume Balok: " + volume);
    }

    public void luas(){
        luas = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
        System.out.println("Luas Balok: " + luas);
    }
}

class bola extends BangunRuang{
    double jarijari;

    public void volume(){
        volume = 4/3 * Math.PI * jarijari * jarijari * jarijari;
        System.out.println("Volume Bola: " + volume);
    }

    public void luas(){
        luas = 4 * Math.PI * jarijari * jarijari;
        System.out.println("Luas Bola: " + luas);
    }
}

class tabung extends BangunRuang{
    double jari;
    double tinggi;

    public void volume(){
        volume = Math.PI * jari * jari * tinggi;
        System.out.println("Volume Tabung: " + volume);
    }

    public void luas(){
        luas = 2 * Math.PI * jari * (jari + tinggi);
        System.out.println("Luas Tabung: " + luas);
    }
}