import java.util.Scanner;

public class ScannerEksempel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Læs et heltal
        System.out.print("Indtast din alder: ");
        int alder = scanner.nextInt();
        System.out.println("Du er " + alder + " år gammel.");

        // Læs ét ord
        System.out.print("Indtast dit navn: ");
        String navn = scanner.next();
        System.out.println("Hej, " + navn + "!");

        scanner.close();
    }
}