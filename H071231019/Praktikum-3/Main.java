public class Main {
    public static void main(String[] args) {
        Kopi kopi1 = new Kopi("Arabica", "Asam", 50);
        Kopi kopi2 = new Kopi("Robusta", "Pahit");
        Popularitas popular1 = new Popularitas(2.0);
        Popularitas popular2 = new Popularitas(6.0);

        kopi1.takePopularitas(popular1);
        kopi2.takePopularitas(popular2);
        kopi2.harga = 50;

        kopi1.display();
        kopi1.rekomendasi();

        kopi2.display();
        kopi2.rekomendasi();
    }
}