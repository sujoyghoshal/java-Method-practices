import java.util.Scanner;

public class DistributeChocolates {
    //distributing chocolates and count per child and remaining chocolates
    public static int[] distributeChocolates(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter chocolates and children: ");
        int chocolates = scanner.nextInt(), children = scanner.nextInt();
        
        int[] result = distributeChocolates(chocolates, children);
		
		// Displaying the result and calling the function
        System.out.println("Each child gets: " + result[0] + ", Remaining chocolates: " + result[1]);
    }
}