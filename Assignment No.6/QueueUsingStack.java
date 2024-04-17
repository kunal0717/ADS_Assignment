import java.util.*;


class QueueUsingStack{
	
	static Stack<Integer> s1 = new Stack<>();
	static Stack<Integer> s2 = new Stack<>();

	static void enQueue(int i){
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}

		s1.push(i);

		while(!s2.isEmpty()){
			s1.push(s2.pop());
		}
	}

	static int deQueue(){
		if(s1.isEmpty()){
			return -1;
		}

		int x = s1.peek();
		s1.pop();
		return x;
	};

	public static void main(String[] args){
		
	 QueueUsingStack q = new QueueUsingStack(); 
  	  q.enQueue(1); 
    	  q.enQueue(2); 
          q.enQueue(3); 
 
    	System.out.println(q.deQueue()); 
    	System.out.println(q.deQueue());
   	System.out.println(q.deQueue());
		
	}

}