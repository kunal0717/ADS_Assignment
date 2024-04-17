
class Program {

	Node head;
	class Node{
		int data;
		Node next;

		Node(int data){
			this.data = data;
		}
	
	}

	public void printLinkedList(Node head){
		if(head == null){
		System.out.println("List is empty");
			return;
		}
		
		Node temp = head;
		while(temp.next != null){
			
		}
		
		
	}

	public static void main(String[] args){
		Program p = new Program();
		
		Node head = new Node(10);
		Node n1 = new Node(20);
		Node n2 = new Node(30);
		Node n3 = new Node(40);

		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = null;

		printLinkedList(head);
				
		
		
	}

}