import java.util.Scanner;

public class MathFunctions {
    
    // Method to calculate Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    // Method to find the equation of the line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1); // Slope
        double b = y1 - (m * x1); // Y-intercept
        return new double[]{m, b};
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        
        scanner.close();
        
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        double[] equation = findLineEquation(x1, y1, x2, y2);
        
        System.out.printf("Euclidean Distance: %.2f\n", distance);
        System.out.printf("Equation of Line: y = %.2fx + %.2f\n", equation[0], equation[1]);
    }
}