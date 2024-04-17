
class Perfect{

	public static void main(String[] args) {
	
	int number = 28;
	
	if (isPerfect(number)) {
	System.out.println(number + " ek perfect number hai.");
	} else {
	System.out.println(number + " ek perfect number nhi hai.");
}
}
	public static boolean isPerfect(int num) {
	if (num <= 1) {
	return false;
}
	int sum = 1;
	for (int i = 2; i <= Math.sqrt(num); i++) {
	if (num % i == 0) {
	sum += i;
	if (i != num / i) {
	sum += num / i;
}
}
}
	return sum == num;
}
}

