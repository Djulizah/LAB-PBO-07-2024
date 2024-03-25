import java.util.Scanner;

public class TP1_1_H071231019 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int barisSatu;
        double inputan;
        int bilanganBulat = 0;
        int bilanganDesimal = 0;
        
        while (true){
            if(scanner.hasNextInt()){ //jika integer masuk
                barisSatu = scanner.nextInt();
                if (barisSatu>0){
                    break;
                }else{
                    System.out.println("Masukkan bilangan bulat positif!");
                }
            }else{  //jika bukan integer masuk
                scanner.next();
                System.out.println("Masukkan bilangan bulat positif!");
            }
        }

        for(int i = 0;i<barisSatu;i++){
            try {
                inputan = scanner.nextDouble();
                if(inputan%1 == 0){
                    bilanganBulat++;
                }else{
                    bilanganDesimal++;
                }
            } catch (Exception e) {
                System.out.println("Masukkan bilangan!");
                scanner.next(); //kalau nextLine terulang dari awal jika baris kedua ada angka dan bukan angka
                i--;
            }
        }

        System.out.println(bilanganBulat + " Bilangan Bulat");
        System.out.println(bilanganDesimal + " Bilangan Desimal");
        scanner.close();
    }
}