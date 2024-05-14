public class Pendidikan extends Kehidupan {
    String pendTerakhir = "";

    @Override
    void prosesKehidupan() {
        System.out.print("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");

        while (!getInput(pendTerakhir)) {
            pendTerakhir = in.nextLine();
            if (!getInput(pendTerakhir)) {
                System.out.println("Inputan tidak valid! Pilih pendidikan terakhir sesuai daftar yang ada!");
                System.out.print("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
            }
        }

        if (!pendTerakhir.equals("SD") && !pendTerakhir.equals("SMP")) {
            poin++;
        }
    }

    boolean getInput(String pend) {
        String[] listPend = {"SD", "SMP", "SMA", "SMK", "S1", "S2", "S3"};
        for (String p : listPend) {
            if (pend.equals(p)) {
                return true;
            }
        }
        return false;
    }
}