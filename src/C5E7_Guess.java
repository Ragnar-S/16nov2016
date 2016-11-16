import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ragnar on 13-Nov-16.
 */
public class C5E7_Guess {

    public static void main(String[] args) {
        System.out.print("I'm thinking of a number between 1 and 100.\n1 and 100 included. ");
        System.out.println("Can you guess what it is?\n");
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        myGuess(number);
        System.out.println("Well done.");
    }

    public static void myGuess(int randomNumber) {
        System.out.print("Enter your number: ");
        Scanner in = new Scanner(System.in);
        int myGuess = in.nextInt();

        if (myGuess > 100 || myGuess < 0) {
            System.out.println("Try again. Enter a number between 0 and 100.");
            myGuess(randomNumber);
        } else if (randomNumber > myGuess) {
            System.out.println("The number you've chosen was too low.");
            myGuess(randomNumber);
        } else if (randomNumber < myGuess) {
            System.out.println("The number you've chosen was too high.");
            myGuess(randomNumber);
        } else {
            System.out.print("Correct! ");
        }
        return;
    }
}