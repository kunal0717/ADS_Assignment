import java.util.Scanner;

public class Prime{

	public static boolean primeChecker(int n, int i){
		//keep i=2 as initial.
		
		if(n==i)
		return true;
		else if(n%i == 0)
		return false;
		else
		return primeChecker(n,i+1);
	
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:	");
		int n = sc.nextInt();
		
		boolean flag = primeChecker(n,2);

		if(flag){
			System.out.println(n + " is a prime number");
		}else{
			System.out.println(n + " is not a prime number");
		}
		
	}
}