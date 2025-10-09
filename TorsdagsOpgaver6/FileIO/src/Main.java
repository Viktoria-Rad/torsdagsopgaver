import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileIO fileIO = new FileIO();
        String filNavn = null;
        String Indhold = null;
        boolean succes = false;

        while(!succes){
            System.out.println("Indtast filnavn til at læse.");
            filNavn = scanner.nextLine();
            try{
                Indhold = fileIO.laesFilIndhold(filNavn);
                succes = true;
                System.out.println("Filen består af: ");
            } catch (FileNotFoundException e) {
                System.out.println("Prøv igen");
            }
            }
        scanner.close();
        //System.out.println("\nFilens inhold: ");
       // System.out.println(Indhold);

        }

        // Bed brugeren om filnavn
        // Kald fileIO.laesFilIndhold() i en try-catch
        // Hvis FileNotFoundException: bed om nyt filnavn og prøv igen
        // Fortsæt indtil en gyldig fil er læst
        // Print filens indhold
    }
