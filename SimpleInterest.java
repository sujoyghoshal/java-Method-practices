import java.util.Scanner;

public class SimpleInterest
{
    public static void interest(int p, int r, int t) { 
        double Interest = (double)(p*r*t)/100; // Finding Simple Interest
        System.out.println("The Simple Interest is "+ Interest +" for Principal ,"+ p +" Rate of Interest "+ r + " and Time "+ t);
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// take input from user
		System.out.println("Enter the Principle");
		int Principle = sc.nextInt();
		
		System.out.println("Enter the Rate");
		int Rate = sc.nextInt();
		
		System.out.println("Enter the Time");
		int Time = sc.nextInt();
		
		interest(Principle,Rate,Time);
		
	}
}