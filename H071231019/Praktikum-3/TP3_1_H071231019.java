class Kopi {
    String jenis;
    String rasa;
    int harga;
    Popularitas popularitas;
    
    Kopi(String jenis, String rasa, int harga) {
        this.jenis = jenis;
        this.rasa = rasa;
        this.harga = harga;
    }

    Kopi(String jenis, String rasa) {
        this.jenis = jenis;
        this.rasa = rasa;
    }

    void rekomendasi() {
        if (this.popularitas != null) {
            if(this.popularitas.popularity <= 1) {
                System.out.println("Tidak direkomendasikan");
            } else if(this.popularitas.popularity >= 3) {
                System.out.println("Direkomendasikan");
            } else if(this.popularitas.popularity == 5) {
                System.out.println("Sangat direkomendasikan");
            } else {
                System.out.println("Minum teh saja!");
            }
        } else {
            System.out.println("Data popularitas tidak tersedia.");
        }
    }

    void takePopularitas(Popularitas popularitas) {
        this.popularitas = popularitas;
    }

    public void display() {
        System.out.println("\nJenis\t: " + this.jenis);
        System.out.println("Rasa\t: " + this.rasa);
        System.out.println("Harga\t: " + this.harga);
        if (this.popularitas != null) {
            this.popularitas.display();
        } else {
            System.out.println("Data popularitas tidak tersedia.");
        }
    }
}