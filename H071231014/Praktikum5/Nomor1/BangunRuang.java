public class BangunRuang {
    double luas;
    double volume;

    public void luas(){

    }
    public void volume(){

    }
}

class Kubus extends BangunRuang{
    double rusuk;

    public void luas(){
        luas = 6 * rusuk * rusuk;
    }

    public void volume(){
        volume = rusuk * rusuk * rusuk;
    }
}

class Balok extends BangunRuang{
    double panjang, lebar, tinggi;

    public void luas(){
        luas = (2 * panjang * lebar) + (2 * panjang * tinggi) + (2 * lebar * tinggi);
    }

    public void volume(){
        volume = panjang * lebar * tinggi;
    }
}

class Bola extends BangunRuang{
    double rusuk;

    public void luas(){
        luas = 4 * Math.PI * rusuk * rusuk;
    }

    public void volume(){
        volume = 4/3 * Math.PI * rusuk * rusuk * rusuk;
    }
}

class Tabung extends BangunRuang{
    double rusuk, tinggi;

    public void luas(){
        luas = (2 * Math.PI * rusuk * tinggi) + (2 * Math.PI * rusuk * rusuk * tinggi);
    }

    public void volume(){
        volume = 4/3 * Math.PI * rusuk * rusuk * rusuk;
    }
}