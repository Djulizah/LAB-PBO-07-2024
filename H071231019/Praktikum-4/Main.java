public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku();

        buku1.setJudul("Hujan");
        buku1.setDurasi(100);
        buku1.setPengarang("Tere Liye");
        buku1.setGenre("Fiksi");
        buku1.setSinopsis("Percintaan antara Lail dan Esok, yaitu kenyataan bahwa rasa cinta dapat memberikan dampak besar dalam kehidupan");

        buku1.displayInfo();

        Buku buku2 = new Buku("Bulan", 150, "Tere Liye", "Fantasi", "Seorang anak perempuan bernama Seli yang berusia 15 tahun bersama kehidupan sehari-harinya.");

        System.out.println("\nInfomasi Buku Kedua:");
        System.out.println("Judul: " + buku2.getJudul());
        System.out.println("Durasi: " + buku2.getDurasi() + " halaman");
        System.out.println("Pengarang: " + buku2.getPengarang());
        System.out.println("Genre: " + buku2.getGenre());
        System.out.println("Sinopsis: " + buku2.getSinopsis());

        SelfUtils.displaySelfData();



    }
}
