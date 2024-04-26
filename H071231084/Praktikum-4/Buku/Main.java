package Buku;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.setJudul("Bumi");
        buku1.setPengarang("Tere Liya");
        buku1.setGenre("Adventure");
        buku1.setSinopsis("Petualangan Raib di Klan Bumi");
        buku1.setDurasi(5);
        buku1.displayInfo();
        System.out.println();

        Buku buku2 = new Buku("Bulan", "Tere Liye", "Adventure", "Petualangan Raib di Klan Bulan", 6);
        System.out.println("Judul Buku: " + buku2.getJudul());
        System.out.println("Nama Pengarang: " + buku2.getPengarang());
        System.out.println("Sinopsis: " + buku2.getSinopsis());
        System.out.println("Genre: " + buku2.getGenre());
        System.out.println("Durasi baca: " + buku2.getDurasi() + " Jam");
        System.out.println();

        SelfUtils.displaySelfData();
    }
}