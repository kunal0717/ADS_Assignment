import java.util.Scanner;

public class GCD{

	public static int findGCD(int num1, int num2){
		if(num1 % num2 == 0)
		return num2;
		else 
		return findGCD(num2, num1%num2);
	
	}

	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first and second number:	");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.print("GCD of the numbers is :	"+ findGCD(num1, num2));

	}
}