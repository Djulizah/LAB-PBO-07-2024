public class Projek extends Kehidupan {
    int jumlahProjek;

    @Override
    void prosesKehidupan() {
        System.out.println("Projek IT: ");
        System.out.println("1. Minimal 4\n2. Minimal 8\n3. Minimal 12\n4. Lebih dari 15");
        int projek = getInput();
        if (projek > 1) {
            poin++;
            if (projek == 2) {
                jumlahProjek = 8;
            } else if (projek == 3) {
                jumlahProjek = 12;
            } else if (projek == 4) {
                jumlahProjek = 16;
            }
        }
    }   
}