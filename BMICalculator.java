import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3]; // 2D array to store weight, height, and BMI

        // Taking input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble() / 100; // Convert cm to meters
        }

        // Calculating BMI and storing in the array
        for (int i = 0; i < 10; i++) {
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
        }

        // Determining BMI status for each person
        String[] statuses = determineBMIStatus(data);

        // Displaying results
        System.out.println("\nPerson\tWeight(kg)\tHeight(m)\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s\n", (i + 1), data[i][0], data[i][1], data[i][2], statuses[i]);
        }

        scanner.close();
    }

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // Method to determine BMI status based on BMI values
    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[10];
        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }
}
