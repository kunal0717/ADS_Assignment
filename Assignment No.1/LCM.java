import java.util.*;

public class LCM{
	

	public static int findLCM(int num1, int num2, int m){

		m = m+num2;
		if(m % num1==0 && m % num2 == 0){
			return m;
		} 
		return findLCM(num1, num2, m);
	}
	

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first and second number:	");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.print("The LCM of the numbers is 	:"+ findLCM(num1, num2, 0));
	}
}