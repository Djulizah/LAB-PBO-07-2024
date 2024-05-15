import java.util.InputMismatchException;

public class Pengalaman extends Kehidupan {
    @Override
    void prosesKehidupan() {
        System.out.println("Pengalaman sebelumnya: ");
        System.out.println("1. Freelancer\n2. Magang\n3. Pekerja tetap\n4. Tidak ada");
        if (getInput() != 4) {
            System.out.print("Gaji sebelumnya: ");
            boolean validInput = false;
            while (!validInput) {
                try {
                    int gaji = in.nextInt();
                    setGaji(gaji);
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Inputan harus dalam bentuk angka!");
                    in.nextLine();
                }    
            }
        } else {
            setGaji(5000000);
        }
    }    

    void Organisasi() {
        System.out.println("Pengalaman organisasi: ");
        System.out.println("1. Organisasi kemahasiswaan");
        System.out.println("2. Organisasi sosial");
        System.out.println("3. Organisasi lainnya");
        System.out.println("4. Tidak ada");
        if (getInput() != 4) {
            poin++;
        }
    }
}