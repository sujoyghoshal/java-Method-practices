import java.util.Scanner;

public class SpringSeason {
    // checking for spring season
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
		// taking input from user
		System.out.print("Enter month and day: ");
        int month = scanner.nextInt();
		int day = scanner.nextInt();
        
        System.out.println(isSpringSeason(month, day) ? "It's Spring Season" : "Not a Spring Season");
    }
}