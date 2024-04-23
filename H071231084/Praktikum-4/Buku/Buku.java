package Buku;

public class Buku {
    String judul, pengarang, genre, sinopsis;
    int durasi;

    public Buku() {

    }
    public Buku(String judul, String pengarang, String genre, String sinopsis, int durasi) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.genre = genre;
        this.sinopsis = sinopsis;
        this.durasi = durasi;
    }

    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getPengarang() {
        return pengarang;
    }
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getSinopsis() {
        return sinopsis;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    
    public int getDurasi() {
        return durasi;
    }
    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public void displayInfo() {
        System.out.println("Judul Buku: " + getJudul());
        System.out.println("Nama Pengarang: " + getPengarang());
        System.out.println("Sinopsis: " + getSinopsis());
        System.out.println("Genre: " + getGenre());
        System.out.println("Durasi baca: " + getDurasi() + " Jam");
    }
}
