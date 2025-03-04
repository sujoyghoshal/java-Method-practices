import java.util.Random;
import java.util.Scanner;

public class StudentScoreCalculator {
    
    // Method to generate random marks for students
    public static int[][] generateMarks(int students) {
        Random random = new Random();
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            marks[i][0] = 50 + random.nextInt(51); // Physics marks (50-100)
            marks[i][1] = 50 + random.nextInt(51); // Chemistry marks (50-100)
            marks[i][2] = 50 + random.nextInt(51); // Math marks (50-100)
        }
        return marks;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] marks) {
        int students = marks.length;
        double[][] results = new double[students][3];
        for (int i = 0; i < students; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%.2f\t%.2f\n", 
                i + 1, marks[i][0], marks[i][1], marks[i][2], results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = scanner.nextInt();
        scanner.close();

        int[][] marks = generateMarks(students);
        double[][] results = calculateResults(marks);
        displayScorecard(marks, results);
    }
}