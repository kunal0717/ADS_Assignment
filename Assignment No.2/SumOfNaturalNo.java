import java.util.*;

class SumOfNaturalNo{

	public static int sumOfSeries(int n){
		int sum =0;
		if(n==1){
			return 1;
		}
		return n + sumOfSeries(n-1);
			
	}	


	public static void main(String[] args)	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:	");
		int n = sc.nextInt();
		
		System.out.print(sumOfSeries(n));
	
	}
}