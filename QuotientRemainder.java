import java.util.Scanner;

public class QuotientRemainder {
    //finding the quotient and remainder of division
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number / divisor, number % divisor};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		// taking input from user
        System.out.print("Enter number and divisor: ");
        int number = scanner.nextInt(), divisor = scanner.nextInt();
        
        int[] result = findRemainderAndQuotient(number, divisor);
		
		// displaying the result
        System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);
    }
}