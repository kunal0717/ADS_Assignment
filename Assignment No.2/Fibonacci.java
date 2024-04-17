import java.util.Scanner;

class Fibonacci{

	public static int fib(int n){
        if(n<=1)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=n-2; i>=0; i--){
            System.out.print(fib(i)+" ");
                
        }
	System.out.print(0);

}
}