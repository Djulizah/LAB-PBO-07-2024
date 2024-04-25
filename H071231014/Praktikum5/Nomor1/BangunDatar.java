// package Nomor1;

class BangunDatar{
    double luas;
    double keliling;

    public void luas(){

    }
    public void keliling(){

    }
}

class Persegi extends BangunDatar{
    double sisi;

    public void luas(){
        luas = sisi * sisi;
    }

    public void keliling(){
        keliling = 4 * sisi;
    }
}

class PersegiPanjang extends BangunDatar{
    double panjang;
    double lebar;

    public void luas(){
        luas = panjang * lebar;
    }

    public void keliling(){
        keliling = 2 * (panjang + lebar);
    }
}

class Lingkaran extends BangunDatar{
    double jarijari;

    public void luas(){
        luas = Math.PI * jarijari * jarijari;
    }

    public void keliling(){
        keliling = 2 * Math.PI * jarijari;
    }
}

class Trapesium extends BangunDatar{
    double a, b, c, d, t;

    public void luas(){
        luas = (a + b ) / 2 * t;
    }

    public void keliling(){
        keliling = a + b + c + d;
    }
}