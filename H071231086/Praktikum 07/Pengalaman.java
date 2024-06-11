package Tugas7;

class Pengalaman extends Kehidupan {
    int pengalamankerja;

    public Pengalaman(int pengalamankerja){
        this.pengalamankerja = pengalamankerja;
    }
    public Pengalaman(){
        
    }

    @Override
    public void prosesKehidupan() {
    }

    public static void jenisPekerjaan(){
        System.out.println("Pengalaman Sebelumnya:");
        System.out.println("1. Freelancer ");
        System.out.println("2. Magang ");
        System.out.println("3. Pekerja Tetap");
        System.out.println("4. Tidak Ada");
        System.out.println("Input: ");
    }

}
