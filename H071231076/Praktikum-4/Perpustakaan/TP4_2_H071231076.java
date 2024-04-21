package Perpustakaan;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Harry Potter", "JK ROWLING", "Fantasi", "Seorang anak yang terlahir sebagai penyihir tinggal bersama paman dan bibi yang jahat", 200 );
        buku1.displayinfo();
        
        Buku buku2 = new Buku();
        buku2.setJudul("Wangsit UTBK");
        buku2.setDurasi(150);
        buku2.setGenre("Pelajaran");
        buku2.setPengarang("Adrian");
        buku2.setSinopsis("Pembelajaran terkait utbk 2024");

        System.out.println("Informasi Buku");
        System.out.println("Judul: " + buku2.getJudul());
        System.out.println("Durasi: " + buku2.getDurasi());
        System.out.println("Genre: " + buku2.getGenre());
        System.out.println("Pengarang: " + buku2.getPengarang());
        System.out.println("Sinopsis: " + buku2.getSinopsis());
        
        selfUtils.displayselfdata();
    }
}
