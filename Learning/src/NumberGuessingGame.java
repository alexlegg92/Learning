import java.util.Random;
import java.util.Scanner;

/** The computer generates a random number and the user must guess the number.
 *  The computer will let the user know if their guess is too high, too low, or correct.
 *  Can give the user an unlimited, or limited number of guesses. */

// Breaking down tasks:
// Store a randomly generated number as int.
// Tell the user to input a number and get input.
// Compare user input to random number: if input is too high, low, or correct; respond accordingly.

public class NumberGuessingGame {
    static int generateRandom() {
        Random r = new Random();
        return r.nextInt(10);
    }

    static String checkGuess(int randNum, int userGuess) {
        if (userGuess == randNum) {
            return "You guessed it!";
        } else if (userGuess < randNum) {
            return "Too low!";
        } else {
            return "Too high!";
        }
    }

    public static void main(String[] args) {
        // Get user input and store as int
        Scanner scanner = new Scanner(System.in);

        System.out.println("You have 5 attempts to guess the number, good luck:");

        // Now how can I make it so that the user has 5 attempts.
        // We'll need to take userInput, then run checkGuess on it, up to 5 times.
        // It looks like a new number is generated every loop, let's try storing the randNum as a variable, and not call the method repeatedly.
        int randNum = generateRandom();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int userInput = scanner.nextInt();
            System.out.println(checkGuess(randNum, userInput));
        }
    }
}