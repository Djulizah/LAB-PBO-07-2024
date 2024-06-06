import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class TP8_2_H071231064 {
    public static void main(String[] args) throws InterruptedException {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();

        System.out.println("| Text to Type |");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        Typer[] typers = new Typer[3];
        // typers[0] = new Typer("Bot Mansur", new Random().nextInt(150), typeRacer);
        typers[0] = new Typer("Bot Mansur", 80, typeRacer);
        typers[1] = new Typer("Bot Toku", 72, typeRacer);
        typers[2] = new Typer("Bot Yukiao", 70, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));
        typeRacer.startRace();
    }
}

class Typer extends Thread {
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;

    public Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public void setWpm(int wpm) {
        this.wpm = wpm;
    }

    public void addWordTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    public String getWordsTyped() {
        return wordsTyped;
    }

    public String getBotName() {
        return botName;
    }

    public double getWpm() {
        return wpm;
    }

    @Override
    public void run() {
        String[] wordsToType = typeRacer.getWordsToType().split(" ");

        int howLongToType = (int) (60000 / wpm);

        for (String word : wordsToType) {
            try {
                Thread.sleep(howLongToType);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            addWordTyped(word);
        }
        
        this.addWordTyped("(selesai)");
        typeRacer.addResult(new Result(botName, (int) (howLongToType * wordsToType.length / 1000)));
    }
}

class Result {
    private String name;
    private int finishTime;

    public Result(String name, int finishTime) {
        this.name = name;
        this.finishTime = finishTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String racerName) {
        this.name = racerName;
    }

    public int getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int racerTime) {
        this.finishTime = racerTime;
    }
}

class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();

    public String getWordsToType() {
        return wordsToType;
    }

    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    public void setNewWordsToType() {
        Random random = new Random();
        String[] wordsToTypeList = {"Menuju tak terbatas dan melampauinya","Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan\r\n" + //
                        "menginspirasi satu sama lain untuk menjadi yang terbaik","Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan\r\n" + //
                                                        "sederhana di sekitar kita","Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan\r\n" + //
                                                                                                                        "integritas dan empati terhadap orang lain"};
        int angkaRandom = random.nextInt(wordsToTypeList.length);
        wordsToType = wordsToTypeList[angkaRandom];
    }

    public void addResult(Result result) {
        raceStanding.add(result);
    }

    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer:");
        System.out.println("----------------------------");
        raceStanding.sort((r1, r2) -> Integer.compare(r1.getFinishTime(), r2.getFinishTime()));
        int pos = 1;
        for (Result result : raceStanding) {
            System.out.printf("%d. %s = %d s\n", pos++, result.getName(), result.getFinishTime());
        }
    }

    public void startRace() {
        setNewWordsToType();

        for (Typer typer : raceContestant) {
            typer.start();
        }

        while (raceContestant.stream().anyMatch(Thread::isAlive)) {
            try {
                Thread.sleep(2000);
                System.out.println("Typing Progress...");
                System.out.println("======================================");
                for (Typer typer : raceContestant) {
                    System.out.println("- "+ typer.getBotName() + " => " + typer.getWordsTyped());
                }
                System.out.println("======================================");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        printRaceStanding();
    }

}

