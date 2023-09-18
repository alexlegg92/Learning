import java.util.Scanner;

/** Strings refer to sequences of characters that behave like an object.
 *  Get string input from a user and return it reversed. */

public class ReversingString {
    // Method that returns a given string reversed
    static StringBuilder reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse();
    }

    public static void main(String[] args) {
        // Ask the user for a string
        System.out.println("Give me a word:");
        // Get user input and store as a string
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        // Output to user the reversed string method with string as a parameter
        System.out.println(reverseString(userInput));
    }
}