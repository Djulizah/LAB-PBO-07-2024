public class GermanShepherd  extends Dog{
    public GermanShepherd(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(){
        this.position += 3;
    }

    public void describe(){
        System.out.println("1.Anjing German Shepherd (Herder Jerman) adalah salah satu ras anjing yang paling dihormati dan diakui secara internasional.");
        System.out.println("2.German Shepherd memiliki mantel ganda yang tebal, dengan bulu luar lurus dan bulu dalam yang lebat, biasanya berwarna hitam dengan coklat atau warna krem. ");
        System.out.println("3.German Shepherd juga dikenal sebagai anjing yang cerdas dan berbakat.");
        System.out.println("4.Rata-rata panjang anjing German Shepherd adalah " + this.averageLength);
    }
}
