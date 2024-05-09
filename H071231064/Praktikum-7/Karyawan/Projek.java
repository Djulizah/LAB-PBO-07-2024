public class Projek extends Pengalaman {
    int jumlahProjek;

    public Projek(String pengalamanSebelumnya, int jumlahProjek) {
        super(pengalamanSebelumnya);
        this.jumlahProjek = jumlahProjek;
    }
    public Projek(int jumlahProjek) {
        this.jumlahProjek = jumlahProjek;
    }
    public Projek() {}

    public int getJumlahProjek() {
        return jumlahProjek;
    }
    public void setJumlahProjek(int jumlahProjek) {
        this.jumlahProjek = jumlahProjek;
    }

    

}
