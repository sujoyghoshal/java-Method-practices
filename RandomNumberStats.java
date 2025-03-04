import java.util.Random;

public class RandomNumberStats {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000); // Ensuring 4-digit number
        }
        return numbers;
    }

    // Method to find the average, min, and max of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);
        
        System.out.print("Generated Numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        double[] stats = findAverageMinMax(randomNumbers);
        System.out.printf("Average: %.2f, Min: %.0f, Max: %.0f\n", stats[0], stats[1], stats[2]);
    }
}
