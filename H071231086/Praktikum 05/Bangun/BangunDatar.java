package Tugas5.Bangun;

public class BangunDatar {
    double luas;
    double keliling;

    public void luas(){

    }

    public void keliling(){

    }
}

class persegi extends BangunDatar{
    double sisi;

    public void luas(){
        luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
    }

    public void keliling(){
        keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
    }
}

class persegipanjang extends BangunDatar{
    double panjang;
    double lebar;

    public void luas(){
        luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luas);
    }
    public void keliing(){
        keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }
}

class lingkaran extends BangunDatar{
    double jarijari;

    public void luas(){
        luas = Math.PI * jarijari * jarijari;
        System.out.println("Luas Lingkaran: " + luas);
    }

    public void keliling(){
        keliling = 2 * Math.PI * jarijari;
        System.out.println("Keliling Lingkaran: " + keliling);
    }
}

class trapesium extends BangunDatar{
    double a, b, c, d, t;

    public void luas(){
        luas = (a + b ) / 2 * t;
        System.out.println("Luas Trapesium: " + luas);
    }

    public void keliling(){
        keliling = a + b + c + d;
        System.out.println("Keliling Trapesium: " + keliling);
    }
 }
