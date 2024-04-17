
class SinglyLL{
	Node head;
	class Node{
		int data;
		Node next;

		Node(int data){
			this.data = data;
		}	
	}

	void insertData(int data){
		Node n = new Node(data);
		if(head == null){
			head = n;
			return;
		}		
			n.next = head;
			head = n;
	}


	void printRecord(){
		Node temp = head;
		if(head == null){
			System.out.println("List is empty");
			return;
		}

		while(temp != null){
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
		
	}
	public static void main(String[] args){
		SinglyLL sl = new SinglyLL();
		

		sl.insertData(50);
		sl.insertData(10);
		sl.insertData(30);

		sl.printRecord();
		
		
	}

}