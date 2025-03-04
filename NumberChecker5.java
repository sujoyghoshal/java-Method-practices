import java.util.Arrays;

public class NumberChecker5 {
    
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
    
    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    
    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }
    
    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseDigitsArray(digits);
        return areArraysEqual(digits, reversed);
    }
    
    // Method to check if a number is a Duck number
    public static boolean isDuckNumber(int number) {
        String numStr = String.valueOf(number);
        return numStr.contains("0");
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
    
    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        return sumOfDigits(square) == number;
    }
    
    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = sumOfDigits(number);
        int product = 1;
        for (int digit : digits) {
            product *= digit;
        }
        return sum == product;
    }
    
    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }
    
    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
    
    // Method to find the factors of a number
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }
    
    // Method to find the greatest factor of a number
    public static int greatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 2]; // Second last element is the greatest proper factor
    }
    
    // Method to find the sum of the factors
    public static int sumOfFactors(int number) {
        int sum = 0;
        int[] factors = findFactors(number);
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    
    // Method to find the product of the factors
    public static int productOfFactors(int number) {
        int product = 1;
        int[] factors = findFactors(number);
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    
    // Method to find the product of the cubes of the factors
    public static double productOfCubesOfFactors(int number) {
        double product = 1;
        int[] factors = findFactors(number);
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
    
    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        return sumOfFactors(number) - number == number;
    }
    
    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        return sumOfFactors(number) - number > number;
    }
    
    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        return sumOfFactors(number) - number < number;
    }
    
    public static void main(String[] args) {
        int number = 28;
        
        System.out.println("Factors: " + Arrays.toString(findFactors(number)));
        System.out.println("Greatest Factor: " + greatestFactor(number));
        System.out.println("Sum of Factors: " + sumOfFactors(number));
        System.out.println("Product of Factors: " + productOfFactors(number));
        System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(number));
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
    }
}