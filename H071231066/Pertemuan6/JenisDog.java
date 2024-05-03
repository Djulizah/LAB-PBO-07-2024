class Pitbul extends Dog{
    public void Move(){
        this.position += 3;
        System.out.println("Pitbull bergerak sebanyak 3, Posisi Sekarang : " + this.position);
        System.out.println();
    }

    public void describe(){
        System.out.println("Pitbull adalah salah satu jenis anjing yang kuat dan berotot. Mereka dikenal karena keberanian dan kekuatan \nfisik mereka yang luar biasa. Meskipun sering dianggap agresif, \nPitbull sebenarnya bisa menjadi sangat setia dan ramah jika dilatih dengan baik");
        System.out.println();
    }
}

class SiberianHusky extends Dog{
    public void Move(){
        this.position += 2;
        System.out.println("Siberian Husky bergerak sebanyak 2, Posisi Sekarang : " + this.position);
        System.out.println();
    }

    public void describe(){
        System.out.println(" Siberian Husky adalah anjing ras berukuran sedang dengan bulu tebal, yang awalnya dibesarkan untuk \nmenarik kereta luncur di lingkungan Arktik yang ekstrem. \nMereka dikenal karena tingkat aktivitas yang tinggi dan sifat yang ramah");
        System.out.println();
    }
}

class Buldog extends Dog{
    public void Move(){
        this.position++;
        System.out.println("Bulldog Bergerak sebanyak 1, posisi sekarang : " + this.position);
        System.out.println();
    }
    public void describe(){
        System.out.println("Bulldog merupakan anjing yang sangat amat ganas");
        System.out.println();
    }
}

class GermanShepherd extends Dog{
    public void Move(){
        this.position += 3;
        System.out.println("German Shepherd bergerak sebanyak 1, Posisinya sekarang : " + this.position);
        System.out.println();
    }

    public void describe(){
        System.out.println("German Shepherd Bla..Bla.. Blaa. Dia blaa.. blaa.. blaa");
        System.out.println();
    }
}