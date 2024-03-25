import java.util.Scanner;

public class soal03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print(" ");
        String input = scanner.nextLine();
        
        String result = convertDate(input);
        System.out.println(result);
        
        scanner.close();
    }

    public static String convertDate(String input) {
        String[] parts = input.split("-");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        
        String[] NamaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        
        String monthName = NamaBulan[month - 1];
        
        if (year <= 40) {
            year += 2000; 
        }else if (year < 100) {
             year += 1900;
        }
        
        return day + " " + monthName + " " + year;
    }
}
