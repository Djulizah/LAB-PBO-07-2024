import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.println("====== BANGUN RUANG ======");
        System.out.println("1.KUBUS");
        System.out.println("2.BALOK");
        System.out.println("3.BOLA");
        System.out.println("4. TABUNG");
        System.out.println("====== BANGUN DATAR ======");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. TRAPESIUM");
        System.out.println("---------------------------");
        System.out.print("Pilihan : ");
        int pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan) {
            case 1:
                Kubus kubus = new Kubus();
                System.out.print("Masukan sisi : ");
                kubus.rusuk = input.nextDouble();
                kubus.luas();
                kubus.volume();
                System.out.println("Luas Kubus : " + kubus.luas);
                System.out.println("Volume Kubus : " + kubus.volume); 
                break;

            case 2:
                Balok balok = new Balok();
                System.out.print("Masukkan Panjang : " );
                balok.panjang = input.nextDouble();
                System.out.print("Masukkan Lebar : ");
                balok.lebar = input.nextDouble();
                System.out.print("Masukkan Tinggi : ");
                balok.tinggi = input.nextDouble();
                balok.luas();
                balok.volume();
                System.out.println("---------------------------");
                System.out.println("Luas Balok : " + balok.luas);
                System.out.println("Volume Balok : " + balok.volume);
                System.out.println("---------------------------");
                break;

            case 3:
                Bola bola = new Bola();
                System.out.print("Masukkan Jari-jari : ");
                bola.rusuk = input.nextDouble();
                bola.luas();
                bola.volume();
                System.out.println("---------------------------");
                System.out.println("Luas Bola : " + bola.luas);
                System.out.println("Volume Bola : " + bola.volume);
                System.out.println("---------------------------");

            case 4:
                Tabung tabung = new Tabung();
                System.out.print("Masukkan Jari-jari : ");
                tabung.rusuk = input.nextDouble();
                System.out.print("Masukkan Tinggi : ");
                tabung.tinggi = input.nextDouble();
                tabung.luas();
                tabung.volume();
                System.out.println("---------------------------");
                System.out.println("Luas Tabung : "+ tabung.luas);
                System.out.println("Volume Tabung : " + tabung.volume);
                System.out.println("---------------------------");
                break;

            case 5:
                Persegi persegi = new Persegi();
                System.out.print("Masukkan Sisi : ");
                persegi.sisi = input.nextDouble();
                persegi.luas();
                persegi.keliling();
                System.out.println("---------------------------");
                System.out.println("Luas Persegi : " + persegi.luas);
                System.out.println("Keliling Persegi : " + persegi.keliling);
                System.out.println("---------------------------");
                break; 

            case 6:
                PersegiPanjang persegiPanjang = new PersegiPanjang();
                System.out.print("Masukkan Panjang : ");
                persegiPanjang.panjang = input.nextDouble();
                System.out.print("Masukkan Lebar : ");
                persegiPanjang.lebar = input.nextDouble();
                persegiPanjang.keliling();
                persegiPanjang.luas();
                System.out.println("---------------------------");
                System.out.println("Luas Persegi Panjang : " + persegiPanjang.luas);
                System.out.println("Keliling Persegi Panjang : " + persegiPanjang.keliling);
                System.out.println("---------------------------");
                break;

            case 7:
                Lingkaran lingkaran = new Lingkaran();
                System.out.print("Masukkan Jari-jari : ");
                lingkaran.jarijari = input.nextDouble();
                lingkaran.luas();
                lingkaran.keliling();
                System.out.println("---------------------------");
                System.out.println("Luas Lingkaran : " + lingkaran.luas);
                System.out.println("Keliling Lingkaran : " + lingkaran.keliling);
                System.out.println("---------------------------");
                break;
            case 8:
                Trapesium trapesium = new Trapesium();
                System.out.print("Masukkan sisi 1 : ");
                trapesium.a = input.nextDouble();
                System.out.print("Masukkan sisi 2 : ");
                trapesium.b = input.nextDouble();
                System.out.print("Masukkan sisi 3 : ");
                trapesium.c = input.nextDouble();
                System.out.print("Masukkan sisi 4 : ");
                trapesium.d = input.nextDouble();
                System.out.print("Masukkan Tinggi : ");
                trapesium.t = input.nextDouble();
                trapesium.luas();
                trapesium.keliling();
                System.out.println("---------------------------");
                System.out.println("Luas Trapesium : " + trapesium.luas);
                System.out.println("Keliling Trapesium : " + trapesium.keliling);
                System.out.println("---------------------------");
                break;

            default:
                System.out.println("Masukkan Angka 1-8");
                System.out.println("---------------------------");
                break;
        }
        input.close();

    }
}
