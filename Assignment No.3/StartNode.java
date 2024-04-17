
class StartNode{
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(){
		}
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
	

	public static Node detectLoop(Node head){
		Node temp = new Node();

		while(head != null){
			if(head.next == null){
				return null;
			}

			if(head.next == temp){
				break;
			}

			Node n = head.next;
			head.next = temp;
			head = n;
		}
		return head;
	}
	


	public static void main(String[] args){
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);

		printList();

		System.out.println(detectLoop(head));
		
	
	}
}