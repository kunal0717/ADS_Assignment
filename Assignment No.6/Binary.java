class Binary{

	public static int binarySearch(int[] arr, int l, int r, int x){
		while(l<=r){
			int mid = (l+r)/2;

			if(arr[mid] == arr[x]){
				return mid;	
			}else if(arr[mid] > arr[x]){
				r = mid-1;			
			}else{
				l = mid+1;
			}
		}
			return -1;
	}

	public static void main(String[] args){
		int[] arr = {10, 20, 30, 40, 50, 60};
		int n = arr.length;
		int i = 3;

		int res = binarySearch(arr, 0, n-1, i);

		if(res == -1){
			System.out.println("Aap glt element search kr rhe ho");
		}else{
			System.out.println("Aapki khoj safal hui");
		}
	}

}