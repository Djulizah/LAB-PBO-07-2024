package Tugas7;

public class Pendidikan extends Kehidupan {
    String pendidikan;


    public String getPendidikan() {
        return pendidikan;
    }
    public Pendidikan (String pendidikan){
        this.pendidikan = pendidikan;
    }
    public Pendidikan(){

    }

    public void jenjangPendidikan(){
        System.out.println("Pendidikan = " + getPendidikan());
    }

    @Override
    public void prosesKehidupan(){

    }
    
}
