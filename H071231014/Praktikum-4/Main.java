public class Main {
    
    public static void main(String[] args) {
        
        Buku buku1 = new Buku();

        buku1.setJudul("The Lord Of the rings");
        buku1.setDurasi(480);
        buku1.setPengarang("J.R.R Tolkien");
        buku1.setGenre("fantasy");
        buku1.setSinopsis("An epic tale of hobbits");

        buku1.displayInfo();


        Buku buku2 = new Buku("Pelangi",235,"Musliati","nonfantasy","noresume");

        System.out.println("==============================");
        System.out.println("judul : " + buku2.getJudul());
        System.out.println("durasi : " + buku2.getDurasi());
        System.out.println("pengarang : " + buku2.getJudul());
        System.out.println("genre : " + buku2.getGenre());
        System.out.println("sinopsis : " + buku2.getSinopsis());
        System.out.println("==============================");

        SelfUtils.displaySelfData();
       
    }
}
