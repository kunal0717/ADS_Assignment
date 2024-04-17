class SortZOT{

	public static void sort(int[] arr, int n){
		int low = 0;
		int high = n-1;

		for(int i=0; i<n && i<=high; ){
			if(arr[i] == 0){
				swap(arr, low, i);
				low++;
				i++;
			}else if(arr[i] == 2){
				swap(arr, i, high);
				high--;
			}else{
				i++;
			}
		}
	}

	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;	
	}
	
	public static void print(int[] arr, int n){
		for(int i=0; i<n; i++){
			System.out.print(arr[i] + " ");
		}

	}
	
	public static void main(String[] args){
		int arr[] = {0, 1, 1, 0, 2, 0, 1, 2, 2};
		int n = arr.length;

		sort(arr, n);
		
		print(arr, n);

	}


}