import java.util.Scanner;

public class TalFraBruger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = true;
        int birthYear = 0;
        int currentYear = 2025;

        while (validInput == true) {
            System.out.println("Indtast dit fødselsår:");
            String input = scanner.nextLine();
            try {
                birthYear = Integer.parseInt(input);
                if(currentYear<birthYear){
                    System.out.println("Fejl: Indtastede år er ældre end aktuelle år.");
                    continue;
                }
                validInput = false;
            } catch (NumberFormatException e) {
                System.out.println(e);
                System.out.println("Fejl: Du skal indtaste et gyldigt år. Prøv igen.");
            }
        }
        int age = currentYear - birthYear;
        System.out.println(age);
        // Brug Integer.parseInt til at konvertere input til int
        // Beregn brugerens alder (antag at nuværende år er 2025)
        // Print alderen
    }
}
