

class Node {
	int data;
	Node next;

	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class ReversedLL{

	void printLL(Node head){
		Node temp = head;
		if(head == null){
			System.out.println("List is empty");
		}

		while(temp != null){
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}


	Node reversedLL(Node head){
		Node temp = head;	
		Node prev = null;
		Node curr = head;

		if(head == null){
			return head;
		}
		
		while(curr!= null){
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;				
		}
		head = prev;
		return prev;
			
		
	}


	public static void main(String[] args){
		ReversedLL rl = new ReversedLL();
	
		Node head = new Node(10);
		Node n1 = new Node(20);
		Node n2 = new Node(30);
		Node n3 = new Node(40);
		Node n4 = new Node(50);

		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		


		rl.printLL(head);

		head = rl.reversedLL(head);
		
		rl.printLL(head);
	}
	
}