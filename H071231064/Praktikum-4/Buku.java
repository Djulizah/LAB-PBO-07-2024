public class Buku {
    private String judul;
    private int durasi;
    private String pengarang;
    private String genre;
    private String sinopsis;
    
    public Buku(String judul, int durasi, String pengarang, String genre, String sinopsis) {
        this.judul = judul;
        this.durasi = durasi;
        this.pengarang = pengarang;
        this.genre = genre;
        this.sinopsis = sinopsis;
    }
    public Buku(){

    }
    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public int getDurasi() {
        return durasi;
    }
    public void setDurasi(int durasi) {
        this.durasi = durasi;
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

    public void displayInfo(){
        System.out.println("================================");
        System.out.println("Judul : " + judul);
        System.out.println("Durasi : " + durasi);
        System.out.println("Genre : " + genre);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Sinopsis : " + sinopsis);
    }
    
}

// Kerjakan Step by Step dengan menerapkan konsep encapsulation dan di kerjakan di depan asisten
// 1. Buatlah sebuah kelas bernama Buku.
// 2. Tambahkan atribut (judul, durasi, pengarang, genre, sinopsis) pada kelas Buku.
// 3. Buat kelas Main dan tambahkan sebuah method main ke dalamnya.
// 4. Buat sebuah instance (objek) Buku di dalam method main pada kelas Main dengan menggunakan constructor yang kosong.
// 5. Gunakan method setter untuk memberikan nilai ke semua atribut yang ada di kelas Buku.
// 6. Tambahkan behavior displayInfo() pada kelas Buku yang akan menampilkan semua informasi nilai atribut di console.
// 7. Panggil method displayInfo() setelah method setter pada method main.
// 8. Buatlah sebuah instance objek Buku kedua, setelah method displayInfo(), dimana di dalam constructor-nya semua atribut di kelas Buku langsung diberikan nilai.
// 9. Tampilkan semua informasi nilai atribut pada objek Buku kedua menggunakan method getter.
// 10. Buatlah sebuah class bernama SelfUtils.java.
// 11. Tambahkan sebuah method static bernama displaySelfData() di dalam kelas SelfUtils.java. Di dalam method tersebut, tampilkan nama dan NIM Anda di console nmenggunakan sysout.
// 12. Panggil method SelfUtils.displaySelfData() di bagian paling bawah method main pada kelas Main.

// Dalam kode di atas, pastikan untuk mengganti [Your Name] dan [Your NIM] dengan informasi Anda yang sesungguhnya.
