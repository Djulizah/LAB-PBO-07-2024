package login_app.No2;

public class Buku {
    public String judul, pengarang, genre, sinopsis;
    public int durasi;
    public String getJudul() {
        return judul;
    }
    public String getPengarang() {
        return pengarang;
    }
    public String getGenre() {
        return genre;
    }
    public String getSinopsis() {
        return sinopsis;
    }
    public int getDurasi() {
        return durasi;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public Buku(String judul, String pengarang, String genre, String sinopsis, int durasi){
        this.judul = judul;
        this.pengarang = pengarang;
        this.genre = genre;
        this.sinopsis = sinopsis;
        this.durasi = durasi;

    }

    public Buku (){

    }

    public void displayInfo(){
        System.out.println("Judul Buku: " + judul);
        System.out.println("Pengarang Buku:" + pengarang);
        System.out.println("Genre Buku: " + genre);
        System.out.println("Genre Sinopsis: " + sinopsis);
        System.out.println("Durasi Buku: " + durasi);

    }
    
}
