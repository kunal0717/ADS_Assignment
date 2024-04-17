import java.util.*;

class QueueImplement{


	public static void main(String[] args){
			Queue<Integer> q = new LinkedList<>();


		for(int i=0; i<5; i++){
			q.add(i);
		}

		System.out.println(q);

		int remove = q.remove();
		System.out.println(remove);

		System.out.println(q);

	}

}