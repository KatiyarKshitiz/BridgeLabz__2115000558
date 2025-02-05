import java.util.HashSet;
import java.util.Random;

public class OTPGenerator {
public static int generateOTP() {
Random random = new Random();
return 100000 + random.nextInt(900000);
}
public static boolean areOTPsUnique(int[] otps) {
HashSet<Integer> uniqueOTPs = new HashSet<>();
for (int otp : otps) {
if (!uniqueOTPs.add(otp)) return false;
}
return true;
}
public static void main(String[] args) {
int[] otps = new int[10];
for (int i = 0; i < otps.length; i++) {
otps[i] = generateOTP();
}
System.out.print("Generated OTPs: ");
for (int otp : otps) {
System.out.print(otp + " ");
}
System.out.println("\nAre OTPs Unique: " + areOTPsUnique(otps));
}
}

