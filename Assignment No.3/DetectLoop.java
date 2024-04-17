

class DetectLoop{
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
	

	public static boolean isCycle(Node head){
		Node slow = head;
		Node fast = head;
		
		if(head == null || head.next == null) return false;

		while(fast != null && fast.next != null){
			if(slow == fast){
				return true;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return false;
	}
	
	public static void main(String[] args){
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);

		printList();

		if(isCycle(head)){
			System.out.println("has a cycle");
		}else{
			System.out.println("Simple list hai ");
		}
		

		
	}

}