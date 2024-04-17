import java.util.*;

class MeanOfArray{
	
	public static int arrayMean(int[] arr, int n){
		int sum;
		if(n==1)
		return arr[0];
		
		//sum = arrayMean(arr, n-1) * (n-1) + arr[n-1];
			
		return (arrayMean(arr, n-1) + arr[n-1])/n;					
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:	");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println(arrayMean(arr, n));
		
	}

}