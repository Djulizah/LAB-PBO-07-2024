package SushiWar;
public class Main {
    public static void main(String[] args) {
        SushiMaker displayName1 = new SushiMaker("Kobo Kanaeru", false);
        SushiMaker displayName2 = new SushiMaker("Windah Basudara", true);

        SushiWar contestant1 = new SushiWar(10, 12);
        contestant1.displayName = displayName1;

        SushiWar contestant2 = new SushiWar(displayName2);
        contestant2.eatingRate = 3;
        contestant2.makingSpeed = 15;
        
        contestant1.displayInfo();
        contestant2.displayInfo();
        System.out.println("= = = = = = = = =  Battle Result  = = = = = = = = =");
        contestant1.startBattle(contestant2);
    }
}