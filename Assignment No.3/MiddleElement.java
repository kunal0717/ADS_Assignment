
class MiddleElement{
	static Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}		
	}
	
	public static Node insertData(int data){
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
		
	public static int middleElement(Node head){
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}

		return slow.data;
	}
	
	public static void main(String[] args){
		insertData(10);
		insertData(20);
		insertData(30);
		insertData(40);
		insertData(50);
		
		printList();
		System.out.println(middleElement(head));		
			
	}


}