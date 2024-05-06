public class Bulldog  extends Dog{
    public Bulldog(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(){
        this.position += 1;
    }

    public void describe(){
        System.out.println("1.Bulldog merupakan ras anjing yang memiliki kesulitan untuk hamil.");
                     
        System.out.println("2.Bulldog dikenal dengan kepribadian yang tenang, setia, dan penuh kasih sayang.");
        System.out.println("3.Bulu mereka pendek dan padat, biasanya berwarna putih dengan bercak-bercak atau pola-pola yang berbeda tergantung pada varietasnya.");
        System.out.println("4.Rata-rata panjang anjing Bulldog adalah " + this.averageLength);
    }

}
    

