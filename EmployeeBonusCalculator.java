import java.util.Random;

public class EmployeeBonusCalculator {
    private static final int EMPLOYEES = 10;

    // Method to generate salary and years of service for employees
    public static int[][] generateEmployeeData() {
        Random random = new Random();
        int[][] data = new int[EMPLOYEES][2];
        for (int i = 0; i < EMPLOYEES; i++) {
            data[i][0] = 10000 + random.nextInt(90000); // Random salary between 10000 and 99999
            data[i][1] = random.nextInt(11); // Random years of service between 0 and 10
        }
        return data;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateNewSalaryAndBonus(int[][] data) {
        double[][] updatedData = new double[EMPLOYEES][2];
        for (int i = 0; i < EMPLOYEES; i++) {
            double bonusPercentage = (data[i][1] > 5) ? 0.05 : 0.02;
            double bonus = data[i][0] * bonusPercentage;
            updatedData[i][0] = data[i][0] + bonus; // New salary
            updatedData[i][1] = bonus; // Bonus amount
        }
        return updatedData;
    }

    // Method to calculate total sums and display data
    public static void displayEmployeeData(int[][] oldData, double[][] newData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.println("Emp#  Old Salary  Years  Bonus  New Salary");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < EMPLOYEES; i++) {
            totalOldSalary += oldData[i][0];
            totalNewSalary += newData[i][0];
            totalBonus += newData[i][1];
            System.out.printf("%3d  %9d  %5d  %6.2f  %10.2f\n", i + 1, oldData[i][0], oldData[i][1], newData[i][1], newData[i][0]);
        }
        System.out.println("------------------------------------------------");
        System.out.printf("TOTAL:  %9.2f       %6.2f  %10.2f\n", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData();
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData);
        displayEmployeeData(employeeData, updatedData);
    }
}