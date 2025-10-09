import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean fileFound = false;

        while (!fileFound) {
            System.out.println("Indtast filnavn til at læse.");
            String fileName = scanner.nextLine();
            try {
                File file = new File(fileName);
                Scanner fileScanner = new Scanner(file);
                fileFound = true;
                System.out.println("File består af: ");
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    System.out.println(line);
                }
                fileScanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("Prøv igen");
            }
        }
        scanner.close();
    }
}