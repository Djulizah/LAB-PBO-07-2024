public class Pitbull extends Dog {
    public Pitbull(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(){
        this.position += 3;
    }

    public void describe(){
        System.out.println("1.Pitbull adalah anjing tidak hanya ganas, namun juga sangat setia pada sang majikan");
        System.out.println("2.Anjing pitbull mempunyai sifat keras kepala dan cenderung susah untuk dikontrol.");
        System.out.println("3.anjing pitbull hanya menyerang ketika merasa terprovokasi atau kesakitan, misalnya saat ia atau majikannya diganggu.");
        System.out.println("4.Rata-rata panjang anjing pitbull adalah " + this.averageLength);
        System.out.println("Pitbull berada pada posisi " + this.getPosition());
    }

}
