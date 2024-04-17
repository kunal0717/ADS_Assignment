class Palindrome{

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
	
	public static boolean isPalindrome(Node head){
		Node slow = head;
		
		
	}


	public static void main(String[] args){
		insert(1);
		insert(2);
		insert(2);
		insert(1);

		printList();
		
	
	}


}