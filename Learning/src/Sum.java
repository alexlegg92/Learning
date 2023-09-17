import java.util.Scanner;

/** User inputs two numbers (variables A and B). Add them together and present the sum. Use methods. */

public class Sum {
    static String returnMessageAndSum(int a, int b) {
        return "The sum is " + (a + b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();

        System.out.print(returnMessageAndSum(a, b));
    }
}
