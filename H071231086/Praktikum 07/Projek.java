package Tugas7;

public class Projek extends Kehidupan {
    int projek;

    public int getProjek() {
        return projek;
    }

    public Projek(int projek) {
        this.projek = projek;
    }
    public Projek (){

    }

    @Override
    public void prosesKehidupan(){

    }

    public static void banyakProjek(){
        System.out.println("Projek IT: ");
        System.out.println("1. Minimal 4");
        System.out.println("2. Minimal 8");
        System.out.println("3. Minimal 12");
        System.out.println("4. Lebih dari 15");
        System.out.println("Input: ");
    }
    
}
