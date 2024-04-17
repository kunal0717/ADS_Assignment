import java.util.*;

class Armstrong{

	public static void main(String[] args) {
	int num = 153;
	if (isArmstrong(num)) {
	System.out.println(num + " ek Armstrong number hai.");
} else {
	System.out.println(num + " ek Armstrong number nhi hai.");
}
}

	public static boolean isArmstrong(int num) {
	int originalNumber = num;
	int numDigits = countDigits(num);
	int sum = 0;
	while (num != 0) {
	int digit = num % 10;
	sum += Math.pow(digit, numDigits);
	num /= 10;
}
	return originalNumber == sum;
}
	public static int countDigits(int num) {
	int count = 0;
	while (num != 0) {
	num /= 10;
	count++;
}
	return count;
}
}

	



