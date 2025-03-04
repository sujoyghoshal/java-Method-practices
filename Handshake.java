import java.util.Scanner;

public class Handshake
{
    public static void Combination(int n) {
        int maximum = (n*(n-1))/2;
        System.out.println("The Possible handShake is " + maximum);
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// take input from user
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		
		Combination(number);
	}
}