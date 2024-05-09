public class Pengalaman extends Kehidupan {
    String pengalamanSebelumnya;

    public Pengalaman(String pengalamanSebelumnya) {
        this.pengalamanSebelumnya = pengalamanSebelumnya;
    }
    public Pengalaman() {}

    @Override
    void prosesKehidupan() {
        
    }

    public String getPengalamanSebelumnya() {
        return pengalamanSebelumnya;
    }
    public void setPengalamanSebelumnya(String pengalamanSebelumnya) {
        this.pengalamanSebelumnya = pengalamanSebelumnya;
    }

}