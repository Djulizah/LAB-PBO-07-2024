class Buku{
    private String judul;
    private int durasi;
    private String pengarang;
    private String genre;
    private String sinopsis;

    Buku(String judul, int durasi, String pengarang, String genre, String Sinopsis){
        this.judul = judul;
        this.durasi = durasi;
        this.pengarang = pengarang;
        this.genre = genre;
        this.sinopsis = Sinopsis;
    }
    Buku(){

    }
    public String getJudul() {
        return judul;
    }

    public int getDurasi() {
        return durasi;
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
    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setDurasi(int durasi){
        this.durasi = durasi;
    }

    public void setPengarang(String Pengarang){
        this.pengarang = Pengarang;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setSinopsis(String sinopsis){
        this.sinopsis = sinopsis;
    }


    public void displayInfo(){
        System.out.println("======== INFO BUKU =======");
        System.out.println("Judul   : " + this.judul);
        System.out.printf("Durasi  : %d Jam", this.durasi);
        System.out.println("Pengarang   : " + this.pengarang);
        System.out.println("Genre   : " + this.genre);
        System.out.println("Sinopsis    : " + this.sinopsis);
        System.out.println("===========================");
    }

}