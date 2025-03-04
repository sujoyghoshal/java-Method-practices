import java.util.Scanner;

public class CheckNumber {
	
    public static void checkNumber(int number) {
		if(number > 0) System.out.println("Positive");
		else if(number < 0) System.out.println("Negative");
		else System.out.println("Zero");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// Taking input from user
        System.out.print("Enter a Number ");
		int number = sc.nextInt();
		checkNumber(number);
	}
}