
class Automorphic{

	public static void main(String[] args) {
	int num = 25;
	
	if (isAutomorphic(num)) {
	System.out.println(num + " ek Automorphic number hai.");
	} else {
	System.out.println(num + " ek Automorphic number nhi hai.");
}
}
	public static boolean isAutomorphic(int num) {
	int square = num * num;
	int numDigits = countDigits(num);
	int lastDigits = square % (int)Math.pow(10, numDigits);
	return lastDigits == num;
}
	public static int countDigits(int num) {
	int count = 0;
	while (	num != 0) {
	num /= 10;
	count++;
}
	return count;
}
}




