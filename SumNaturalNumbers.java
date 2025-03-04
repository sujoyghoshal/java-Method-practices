import java.util.Scanner;

public class SumNaturalNumbers {
    // finding the sum of first n natural numbers using formula
    public static int sumOfNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		// taking input from user
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        System.out.println("Sum: " + sumOfNaturalNumbers(n));
        scanner.close();
    }
}