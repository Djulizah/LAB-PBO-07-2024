package login_app.No2;

public class Main {
    public static void main(String[] args) {
        Buku buku = new Buku();
        buku.setJudul("Hujan");
        buku.setDurasi(350);
        buku.setGenre("Drama");
        buku.setPengarang("Tere Liye");
        buku.setSinopsis(" Rintik Hujan");
        buku.displayInfo();

        Buku buku2 = new Buku("Pulang", "Tere Liye", "Komedi", "Pulang pergi", 450);
        System.out.println("Judul Buku: " + buku2.getJudul());
        System.out.println("Pengarang Buku:" + buku2.getPengarang());
        System.out.println("Genre Buku: " + buku2.getGenre());
        System.out.println("Genre Sinopsis: " + buku2.getSinopsis());
        System.out.println("Durasi Buku: " + buku2.getDurasi());

        SelfUtils.displaySelfData();
    }

}
