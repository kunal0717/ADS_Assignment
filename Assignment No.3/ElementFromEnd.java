
class ElementFromEnd{
	static Node head;
	static class Node{
		int data;
		Node next;

		Node(int data){
			this.data = data;
		}
	}

	public static Node insert(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return head;
		}

		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
		
		return head;

	}
	
	public static void printList(){
		if(head == null){
			return;
		}	
		
		Node temp = head;

		while(temp != null){
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
		System.out.println();
	}
	

	public static void nthElementFromEnd(int n){
		int len =0;
		Node temp = head;
		
		while(temp != null){
			temp = temp.next;
			len++;
		}

		if(len < n) return;

		temp = head;

		for(int i= 1; i<len-n + 1 ; i++){
			temp = temp.next;
		}
		System.out.println(temp.data);
		

		
	}


	public static void main(String[] args){
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);

		printList();

		nthElementFromEnd(4);
		
	
	}
}