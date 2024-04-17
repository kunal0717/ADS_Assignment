

class SumOfDigitOfNum{

	public static void main(String[] args) {
	int number = 12345;

	int sum = calculateSumOfDigits(number);
	System.out.println("Sum of digits of the number: " +sum);
}
	public static int calculateSumOfDigits(int number) {
	if (number == 0) {
	return 0;
}
	int digit = number % 10;
	return digit + calculateSumOfDigits(number / 10);
}

}