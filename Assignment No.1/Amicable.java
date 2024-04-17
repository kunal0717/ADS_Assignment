class Amicable{

	public static void main(String[] args) {
	int num1 = 220;
	int num2 = 284;
	
	if (areAmicable(num1, num2)) {
	System.out.println(num1 + " aur " + num2 + " amicable numbers hai.");
	} else {
	System.out.println(num1 + " aur " + num2 + " amicable numbers nhi hai.");
}
}
	public static boolean areAmicable(int num1, int num2) {
	int sum1 = sumOfProperDivisors(num1);
	int sum2 = sumOfProperDivisors(num2);
	return sum1 == num2 && sum2 == num1;
}
	public static int sumOfProperDivisors(int num) {
	int sum = 1;
	for (int i = 2; i <= Math.sqrt(num); i++) {
	if (num % i == 0) {
	sum += i;
	if (i != num / i) {
	sum += num / i;
}
}
}
return sum;
}

}	