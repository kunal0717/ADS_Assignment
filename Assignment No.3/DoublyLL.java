	
	class Node{
		int data;
		Node next;
		Node prev;

		Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null; 
		}
	}

class DoublyLL{
	static Node head;
	Node tail;

	void printList(Node head){
		Node temp = head;
		
		if(head == null){
			System.out.println("List is empty");
			return;
		}

		while(temp != null){
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		System.out.println();
	}

		
	/*void insertData( int data){
		
		Node newNode = new Node(data);
			
			newNode.next = head; 
			newNode.prev = null;
			
			if(head != null){
			head.prev = newNode;
			}
		
			head = newNode;

	}*/

public void insertFirst(int data){
		Node newNode = new Node(data);

		if(head == null){
			head = newNode;
			return;
		}
	
		newNode.next = head;
		newNode.prev = null;
		head.prev = newNode;
		head = newNode;
		
	}
	public static void main(String[] args){
		DoublyLL dl = new DoublyLL();

		
		head = new Node(10);
		Node n1 = new Node(20);	
		Node n2 = new Node(30);
		Node n3 = new Node(40);

		head.prev = null;
		head.next = n1;
		n1.prev = head;
		n1.next = n2;
		n2.prev = n1;
		n2.next = n3;
		n3.prev = n2;
		
		
		int pos = 0;

		dl.printList(head);
		dl.insertFirst(5);
		dl.printList(head);
		dl.insertFirst(50);
		dl.printList(head);
	}
}