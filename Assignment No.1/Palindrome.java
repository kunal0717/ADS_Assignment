import java.util.*;

class Palindrome{

	public static int palindromeCheck(int n, int temp){
		if(n ==0)
			return temp;
		temp = (temp*10) + (n%10);
			
		return palindromeCheck((n/10), temp);
		
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:	");
		int n = sc.nextInt();
		int temp = palindromeCheck(n,0);

		if(temp == n){
			System.out.println(n+" is a palindrome number");
		}else{
			System.out.println(n+" is not a palindrome number");
		}

	}

}