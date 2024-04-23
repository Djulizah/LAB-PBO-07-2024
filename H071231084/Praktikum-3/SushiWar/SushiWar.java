package SushiWar;
class SushiMaker{
    String name;
    boolean certifiedChef;
 
    SushiMaker(String name, boolean certifiedChef) {
        this.name = name;
        this.certifiedChef = certifiedChef;
    }

    String setDisplayName(){
        if (certifiedChef) {
            return "El 'Chef " + name;
        } else {
            return name;
        }
    }
}

public class SushiWar {
    SushiMaker displayName;
    int makingSpeed, eatingRate, sushiCount;

    public String getdisplayName() {
        return displayName.setDisplayName();
    }

    public SushiWar(int eatingRate, int makingSpeed){
        this.eatingRate = eatingRate;
        this.makingSpeed = makingSpeed;
    }

    public SushiWar(SushiMaker displayName){
        this.displayName = displayName;
    }

    void startBattle(SushiWar opponent){
        int time = 10;
        for (int i = 1; i <= time; i++){
            this.sushiCount += this.makingSpeed;
            opponent.sushiCount += opponent.makingSpeed;
            if (i%5 == 0) {
                this.sushiCount -= opponent.eatingRate;
                opponent.sushiCount -= this.eatingRate;
            }
        }

        if (this.sushiCount > 0){
            System.out.printf("%s managed to secure %d sushi\n", getdisplayName(), this.sushiCount);
        } else {
            System.out.printf("%s didn't manage to secure any sushi\n", getdisplayName());
        }

        if (opponent.sushiCount > 0){
            System.out.printf("%s managed to secure %d sushi\n", opponent.getdisplayName(), opponent.sushiCount);
        } else {
            System.out.printf("%s didn't manage to secure any sushi\n", opponent.getdisplayName());
        }

        System.out.println("\nAfter an intense battle, the ultimate victory goes to...");
        if (this.sushiCount > opponent.sushiCount){
            System.out.println(this.getdisplayName() + "! Congratulations!");
        } else if (this.sushiCount == opponent.sushiCount){
            System.out.println("both competitors!");
        } else {
            System.out.println(opponent.getdisplayName() + "! Congratulations!");
        }
    }

    void displayInfo(){
        System.out.println("================= Contestant Info =================");
        System.out.println("Name\t\t: " + getdisplayName());
        System.out.println("Making Speed\t: " + makingSpeed + " Sushi/Minute");
        System.out.println("Eating Rate\t: " + eatingRate + " Sushi/Chance");
        System.out.println();
    }
}