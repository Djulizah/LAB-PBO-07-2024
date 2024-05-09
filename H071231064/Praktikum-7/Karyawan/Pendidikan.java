public class Pendidikan extends Pengalaman {
    String pendidikanTerakhir;

    public Pendidikan(String pengalamanSebelumnya, String pendidikanTerakhir) {
        super(pengalamanSebelumnya);
        this.pendidikanTerakhir = pendidikanTerakhir;
    }
    public Pendidikan(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }
    public Pendidikan() {}

    public String getPendidikanTerakhir() {
        return pendidikanTerakhir;
    }
    public void setPendidikanTerakhir(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    @Override
    void prosesKehidupan() {
        
    }

}
