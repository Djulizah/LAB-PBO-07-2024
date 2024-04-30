public class Main {
    public static void main(String[] args) {
        Buku bumi = new Buku();
        bumi.setJudul("Bumi");
        bumi.setDurasi(1200);
        bumi.setGenre("Fantasi");
        bumi.setPengarang("Tere Liye");
        bumi.setSinopsis("Seorang anak bernama seli yang bisa menghilang");
        bumi.displayInfo();

        Buku bulan = new Buku("Bulan", 1500, "Tere Liye", "Fantasi", "Lanjutan Cerita Buku Bumi");
        System.out.println("================================");
        System.out.println("Judul : " + bulan.getJudul());
        System.out.println("Durasi : " + bulan.getDurasi());
        System.out.println("Genre : " + bulan.getGenre());
        System.out.println("Pengarang : " + bulan.getPengarang());
        System.out.println("Sinopsis : " + bulan.getSinopsis());
        SelfUtils.displaySelfData();
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
