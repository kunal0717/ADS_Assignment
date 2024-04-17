import java.util.*;

class NumberSeries{
	
	public static void numberSeries(int n){
		if(n>0){
		numberSeries(n-1);
		System.out.println(n);
		}
	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:	");		
		int n = sc.nextInt();

		numberSeries(n);
		
	}

}