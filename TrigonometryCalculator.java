import java.util.Scanner;

public class TrigonometryCalculator {
    // calculating sine, cosine, and tangent of an angle
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert degrees to radians
        return new double[]{Math.sin(radians), Math.cos(radians), Math.tan(radians)};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();
        
        double[] result = calculateTrigonometricFunctions(angle); // calling the function
		
		// displaying the result
        System.out.println("Sin: " + result[0] + ", Cos: " + result[1] + ", Tan: " + result[2]);
    }
}