public class Main {
    public static void main(String[] args){
        Pitbul pitbul = new Pitbul();
        SiberianHusky siberian = new SiberianHusky();
        Buldog buldog = new Buldog();
        GermanShepherd german = new GermanShepherd();

        Smartphone hp = new Smartphone();
        Car mobil = new Car();

        pitbul.Move();
        pitbul.describe();

        siberian.Move();
        siberian.describe();

        buldog.Move();
        buldog.describe();

        german.Move();
        german.describe();

        hp.Move();
        mobil.Move();
    }
}
