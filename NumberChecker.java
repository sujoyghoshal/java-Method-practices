import java.util.Scanner;

public class NumberChecker {

    // Method to check if a number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if a number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Take user input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Check each number
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.println("Number " + numbers[i] + " is positive and " + (isEven(numbers[i]) ? "even." : "odd."));
            } else {
                System.out.println("Number " + numbers[i] + " is negative.");
            }
        }

        // Compare first and last elements
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("First number is greater than the last.");
        } else if (comparisonResult == -1) {
            System.out.println("First number is less than the last.");
        } else {
            System.out.println("First and last numbers are equal.");
        }
    }
}