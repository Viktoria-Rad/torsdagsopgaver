import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {
    public String laesFilIndhold(String filnavn) throws FileNotFoundException {
        File file = new File("tast.txt");
        Scanner fileScanner = new Scanner(file);
        String Indhold = " ";
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
            fileScanner.close();
           return Indhold;
        // Opret Scanner med File
        // Læs hele filens indhold (alle linjer samlet i en String)
        // Luk Scanner
        // Returner indholdet
    }
}
