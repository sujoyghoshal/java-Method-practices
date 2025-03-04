import java.util.Scanner;

public class AthleteRounds {
	
    public static int computeRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3; // Calculate the perimeter of the triangle
        return (int) Math.ceil(5000 / perimeter); // Calculate the required rounds (5km = 5000 meters)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three sides of the triangular park: ");
        double side1 = scanner.nextDouble(), side2 = scanner.nextDouble(), side3 = scanner.nextDouble();
        
        System.out.println("Rounds needed: " + computeRounds(side1, side2, side3));
    }
}