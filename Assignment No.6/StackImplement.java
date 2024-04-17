import java.util.*;

class StackImplement{

	public static void stackPush(Stack<Integer> st){
		for(int i=0; i<5; i++){
			st.push(i);
		}
	}

	public static void stackPop(Stack<Integer> st){
		for(int i=0; i<5; i++){
		Integer x = (Integer) st.pop();
		System.out.println(x);
		}
	}

	public static void main(String[] args){
		Stack<Integer> st = new Stack<Integer>();

		stackPush(st);
		stackPop(st);
		
	}

}