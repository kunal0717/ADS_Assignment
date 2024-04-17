class LinearSearch{

	public static int search(int[] arr, int n, int x){
		for(int i=0; i<n; i++){
			if(arr[i] == arr[x])
				return i;
		}
		return -1;
	}

	public static void main(String[] args){
		int[] arr = {10, 20, 30, 40, 50, 60};
		int n = arr.length;
		int i = 3;

		if(search(arr, n, i) == -1){
			System.out.println("Element nhi hai bhai");
		}else{
			System.out.println("Mil gaya element mil gaya ");
		}
		
	}

		
}