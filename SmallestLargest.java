import java.util.Scanner;

public class SmallestLargest {
    // Method to find the smallest and largest number among three given numbers
    public static int[] findSmallestAndLargest(int num1, int num2, int num3) {
        int smallest = Math.min(num1, Math.min(num2, num3)); // Find the smallest number
        int largest = Math.max(num1, Math.max(num2, num3)); // Find the largest number
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		// taking input from user
        System.out.print("Enter three numbers: ");
        int num1 = scanner.nextInt(), num2 = scanner.nextInt(), num3 = scanner.nextInt();
        
        int[] result = findSmallestAndLargest(num1, num2, num3);
		
		// desplaying the results
        System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);
    }
}