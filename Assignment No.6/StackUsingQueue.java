import java.util.*;


class StackUsingQueue{

	Deque<Integer> mdq = new LinkedList<>();

	public void push(int i){
		mdq.addLast(i);
	}

	int pop(){
		int i= mdq.getLast();
		mdq.removeLast();
		return i;
	}

	boolean isEmpty(){
		return mdq.isEmpty();
	}

	public static void main(String[] args){
		StackUsingQueue st = new StackUsingQueue();
		
		st.push(1);
		st.push(2);
		st.push(3);

		System.out.println(st.pop());
		System.out.println(st.pop());
		
	}

}