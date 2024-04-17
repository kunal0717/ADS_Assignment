class SumOfArrayElements{

	public static void main(String[] args) {
	int[] arr = {1, 2, 3, 4, 5};
	int size = arr.length;
	
	int sum = calculateSum(arr, size);
	System.out.println("Sum of the array elements: " + sum);
	}
	public static int calculateSum(int[] arr, int size) {
	if (size == 0) {
	return 0;
	}
	return arr[size - 1] + calculateSum(arr, size - 1);


}
}