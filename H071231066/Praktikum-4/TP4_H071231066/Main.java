
public class Main{
    public static void main(String[] args) {
        Buku buku = new Buku();
        // Nomor 5
        buku.setJudul("I Want To Eat Your Pancreas");
        buku.setDurasi(3);
        buku.setPengarang("Sumino Yoru");
        buku.setGenre("Romance");
        buku.setSinopsis("BLA BLA BLA...");
        
        buku.displayInfo();// Nomor 7
        
        Buku buku1 = new Buku("Mak Limah", 2, "Roti Jala", "Horor", "Lorem Ipsum ");
        System.out.println(buku1.getJudul());
        System.out.println(buku1.getDurasi());
        System.out.println(buku1.getPengarang());
        System.out.println(buku1.getGenre());
        System.out.println(buku1.getSinopsis());
        System.out.println("============================");

        SelfUtils.displaySelfData();
        
    }
}