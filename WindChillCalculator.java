import java.util.Scanner;

public class WindChillCalculator {
    // calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		// taking user input
        System.out.print("Enter temperature and wind speed: ");
        double temp = scanner.nextDouble(), windSpeed = scanner.nextDouble();
        
		// calling the function and displaying the results
        System.out.println("Wind Chill: " + calculateWindChill(temp, windSpeed));
    }
}