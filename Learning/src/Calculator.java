import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

/** Build a basic calculator: include some basic functions. */

// As main is the first method that gets called, it would make sense that it loads the UI.

public class Calculator {
    // Classes: number, addition, subtraction.
    // An interesting way of accepting multiple args, then returning the result.
//    static int addition(int... args) {
//        int answer = 0;
//        for (int arg : args) {
//            answer += arg;
//        }
//        return answer;
//    }

    static int addition(String s) {
        int answer = 0;
        for (int arg : args) {
            answer += arg;
        }
        return answer;
    }

    public static void main(String[] args) {
        // 1. UI to display classes: number, addition, subtraction.
        Scanner scanner = new Scanner(System.in);

        // Struggling, I can't parse multiply numbers from the user via Scanner.nextInt ...
        // And I can't parse user input into the argument of IntStream.
        // I cheated a bit here, googling solutions for working with arrays and IntStream:
//        int[] intArray = {};
//        for (int i = 0; i <10; i++) {
//            intArray = IntStream.of(10,10,10,10,10).toArray();
//        }
//        for (int x = 0; x < 100; x++) {
//            System.out.println(intArray[x]);
//        }

        // Let's tackle this is smaller steps.
        // I can feed addition many arguments, and it will return the result.
        // How can I take many arguments from the user, a String input? Then convert it to an int array?
        // I guess this will work in my favour as I can check for the addition and subtraction operator and redirect the response.

//        String s = scanner.nextLine();
//        int[] x = {};
//        System.out.print(s);

//        int[] myInt = {};
        // I learnt you can't append elements to an array because they are fixed in size.
        // A good solution would be to use an ArrayList; which can grow:
//        ArrayList<Integer> myInt = new ArrayList<Integer>();
//        while (scanner.hasNextInt()) {
//            myInt.add(scanner.nextInt());
            // I found myself using a for loop to append input to the ArrayList,
            // it was unnecessary, I already had my loop ... the while loop!
//            for (int i = 0; i < 1000; i++) {
//                myInt.add(scanner.nextInt());
//            }
//        }
//        for (int i = 0; i < myInt.size(); i++) {
//            System.out.println(addition(new int[] {myInt.get(i)}));
//        }
//        ArrayList<Integer> myInt = new ArrayList<Integer>();
//        while (scanner.hasNextInt()) {
//            myInt.add(scanner.nextInt());
//        }
//        System.out.println(addition(new int[] {myInt.get(2)}));
        // Now this is getting ridiculous, I don't understand what's going on, I'm trying to force things to work.
        // Maybe if I get the string input from the user as I said I'd do earlier, and check if it contains the + operator, then call the addition function that does all the work ...
        // Then I don't have to worry about trying to convert tricky data types, and overcomplicate things.
        // I see I got carried away when I wanted to convert the string into integers so it can be parsed to addition which accepts max integers.
        String s = scanner.nextLine();
        // And before going down this new route I just realised if I call addition if response contains +, what if it also contains other operators. This is stupid :D
        // Let's just make a limited application, I'm still achieving the task of building a basic calculator.
        if (s.contains("+")) {
            System.out.println(addition(s));
        }
        // I now have a headache and will take a long break ... and when I come back I'll return to my course.
    }
}
