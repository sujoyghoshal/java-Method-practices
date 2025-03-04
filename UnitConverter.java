public class UnitConverter {

    // Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println("5 km to miles: " + convertKmToMiles(5));
        System.out.println("10 miles to km: " + convertMilesToKm(10));
        System.out.println("2 meters to feet: " + convertMetersToFeet(2));
        System.out.println("6 feet to meters: " + convertFeetToMeters(6));
        System.out.println("3 yards to feet: " + convertYardsToFeet(3));
        System.out.println("9 feet to yards: " + convertFeetToYards(9));
        System.out.println("1 meter to inches: " + convertMetersToInches(1));
        System.out.println("12 inches to meters: " + convertInchesToMeters(12));
        System.out.println("10 inches to cm: " + convertInchesToCm(10));
    }
}