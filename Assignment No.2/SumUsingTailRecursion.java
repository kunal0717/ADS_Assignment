

class SumUsingTailRecursion{

	public static void main(String[] args) {
	int[] arr = {1, 2, 3, 4, 5};
	int size = arr.length;

	int sum = calculateSum(arr, size, 0);
	System.out.println("Sum of the array elements: " + sum);
}
	public static int calculateSum(int[] arr, int size, int index) {
	if (index == size) {
	return 0;
}
return arr[index] + calculateSum(arr, size, index + 1);
}
	

}		