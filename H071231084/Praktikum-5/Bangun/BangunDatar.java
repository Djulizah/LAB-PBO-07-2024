package Bangun;

class Persegi extends BangunDatar {
    double s;

    public void Luas() {
        luas = s * s;
        System.out.println("Luas persegi: " + luas);
    }

    public void Keliling() {
        keliling = 4 * s;
        System.out.println("Keliling persegi: " + keliling);
    }
}

class PersegiPanjang extends BangunDatar {
    double p, l;
    
    public void Luas() {
        luas = p * l;
        System.out.println("Luas persegi panjang: " + luas);
    }
    
    public void Keliling() {
        keliling = 2 * (p + l);
        System.out.println("Keliling persegi panjang: " + keliling);
    }
}

class Lingkaran extends BangunDatar {
    double r;
    
    public void Luas() {
        luas = PI * r * r;
        System.out.printf("Luas lingkaran:  %.2f", luas);
    }
    
    public void Keliling() {
        keliling = 2 * PI * r;
        System.out.printf("Keliling lingkaran:  %.2f", keliling);
    }
}

class Trapesium extends BangunDatar {
    double a, b, c, d, t;
    
    public void Luas() {
        luas = ((a + b) * t) / 2;
        System.out.println("Luas trapesium: " + luas);
    }
    
    public void Keliling() {
        keliling = a + b + c + d;
        System.out.println("Keliling trapesium: " + keliling);
    }
}