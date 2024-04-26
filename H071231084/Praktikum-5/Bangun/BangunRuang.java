package Bangun;

class Kubus extends BangunRuang {
    double s;

    public void Volume() {
        volume = s * s * s;
        System.out.println("Volume kubus: " + volume);
    }

    public void Luas() {
        luas = 6 * s * s;
        System.out.println("Luas kubus: " + luas);
    }
}

class Balok extends BangunRuang {
    double p, l, t;

    public void Volume() {
        volume = p * l * t;
        System.out.println("Volume balok: " + volume);
    }

    public void Luas() {
        luas = 2 * ((p*l) + (p*t) + (t*l));
        System.out.println("Luas permukaan balok: " + luas);
    }
}

class Bola extends BangunRuang {
    double r;

    public void Volume() {
        volume = 4/3 * PI * r * r * r;
        System.out.printf("Volume bola: %.2f\n", volume);
    }

    public void Luas() {
        luas = 4 * PI * r * r;
        System.out.printf("Luas permukaan bola: %.2f\n", luas);
    }
}

class Tabung extends BangunRuang {
    double r, t;

    public void Volume() {
        volume = PI * r * r * t;
        System.out.printf("Volume tabung: %.2f\n", volume);
    }

    public void Luas() {
        luas = 2 * PI * r * (t + r);
        System.out.printf("Luas permukaan tabung: %.2f\n", luas);
    }
}