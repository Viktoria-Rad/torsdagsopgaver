import java.util.Scanner;
import java.util.Random;

public class GuessANumber {
    private int numberToGuess;
    private Scanner scanner;

    public GuessANumber (){
        Random random = new Random();
        numberToGuess = random.nextInt(100)+1;
        scanner = new Scanner(System.in);

        System.out.println("DEBUG: numberToGuess = " + numberToGuess);
    }
        public void makeAGuess(){
        System.out.println("Guess a number beetwen 1 and 100");
        int guess = scanner.nextInt();
    
        if(guess == numberToGuess){
            System.out.print("Korrect tallet var " + numberToGuess);
        } else if(guess < numberToGuess ){
            System.out.println("Prøv igen");
            makeAGuess();
        } else{
        System.out.println("For højt, prøv igen");
            makeAGuess();
        }
    }

public static void main(String[] args){
    GuessANumber game = new GuessANumber();
    game.makeAGuess();

    }

}