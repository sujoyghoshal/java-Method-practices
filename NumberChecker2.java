import java.util.Arrays;

public class NumberChecker2 {
    
    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }
    
    // Method to store the digits of the number in an array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }
    
    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    
    // Method to find the sum of the squares of the digits of a number
    public static int sumOfSquaresOfDigits(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    
    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }
    
    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int number) {
        int[] digits = getDigitsArray(number);
        int[][] freqArray = new int[10][2]; // 10 rows for digits 0-9
        
        for (int i = 0; i < 10; i++) {
            freqArray[i][0] = i; // Store digit in the first column
        }
        
        for (int digit : digits) {
            freqArray[digit][1]++; // Increase frequency count
        }
        return freqArray;
    }
    
    public static void main(String[] args) {
        int number = 219;
        
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Digits Array: " + Arrays.toString(getDigitsArray(number)));
        System.out.println("Sum of digits: " + sumOfDigits(number));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(number));
        System.out.println("Is Harshad Number: " + isHarshadNumber(number));
        
        System.out.println("Digit Frequency:");
        int[][] freq = digitFrequency(number);
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + ": " + freq[i][1] + " times");
            }
        }
    }
}