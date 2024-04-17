import java.util.*;


class DequeImplement{

	public static void main(String[] args){
		Deque<Integer> dq = new ArrayDeque<>();

		dq.addFirst(1);
		dq.addLast(2);
		dq.addLast(3);
		dq.addLast(4);
		dq.addLast(5);

		int first = dq.removeFirst();
		int last = dq.removeLast();

		System.out.println(first +" " + last);

	}
	
}