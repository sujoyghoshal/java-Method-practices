import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class NumberChecker6 {
    
    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + new Random().nextInt(900000); // Ensures a 6-digit number
    }
    
    // Method to generate 10 unique OTPs
    public static int[] generateOTPs(int count) {
        int[] otps = new int[count];
        for (int i = 0; i < count; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }
    
    // Method to check if all OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            otpSet.add(otp);
        }
        return otpSet.size() == otps.length;
    }
    
    public static void main(String[] args) {
        int[] otps = generateOTPs(10);
        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("Are OTPs Unique? " + areOTPsUnique(otps));
    }
}