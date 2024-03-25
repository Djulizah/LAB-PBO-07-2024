import java.util.Scanner;
public class TP1_1_H071231064 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Banyak Angka");
        int angka = in.nextInt();
        int bulat = 0;
        int desimal = 0;
        System.out.println("masukkan angka: ");
        try{
        for (int i = 0; i < angka; i++ ){
                double nilai = in.nextDouble();
                if (nilai % 1 == 0){
                    bulat++;
                }else {
                    desimal++;
                }
            }
        System.out.println(bulat + " bilangan bulat");
        System.out.print(desimal + " bangan desimal");
        }catch(Exception e){
            System.out.println("Input bukan angka");
    }
    in.close();
}
}