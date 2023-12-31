import java.util.Scanner;

/** User inputs two numbers (variables A and B). Add them together and present the sum. Use methods. */

public class Sum {
    // I want to return a String.
    // Deprecated method:
//    static String returnMessageAndSum(int a, int b) {
//        return "The sum is " + (a + b);
//    }

    static int newSumMethod(int a, int b) {
        return Integer.sum(a, b);
    }

    public static void main(String[] args) {
        // Use Scanner class to get user input. And create an object of the class.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        // We can call methods on the Scanner object.
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();

        // Deprecated method call
//        System.out.print(returnMessageAndSum(a, b));
        System.out.print(newSumMethod(a, b));
    }
}
