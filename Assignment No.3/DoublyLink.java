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

public class DoublyLink{
	static Node head;
	static Node tail;

	public void addFirst(int data){
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

	public void printList(Node head){
		if(head == null){
			System.out.println("Empty list");
		}
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println();

	}

	public static void main(String[] args){

		DoublyLink dl = new DoublyLink();

		dl.addFirst(10);
		dl.addFirst(20);
		dl.addFirst(30);

		dl.printList(head);
		dl.addFirst(40);
		dl.printList(head);
		
	}


}