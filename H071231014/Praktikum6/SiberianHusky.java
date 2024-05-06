public class SiberianHusky extends Dog{
    public SiberianHusky(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(){
        this.position += 2;
    }

    public void describe(){
        System.out.println("1.Anjing Siberian Husky adalah salah satu ras anjing yang menarik dan indah, terkenal dengan bulu tebal dan mata biru atau cokelat yang mencolok.");
                     
        System.out.println("2.Siberian Husky biasanya memiliki mantel berwarna abu-abu atau hitam, sering kali dengan pola wajah yang kontras.");
        System.out.println("3.Siberian Husky dikenal sebagai anjing yang ramah, ceria, dan sosial. ");
        System.out.println("4.Rata-rata panjang anjing Siberian Husky adalah " + this.averageLength);
    }
}
