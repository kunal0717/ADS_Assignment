class Node{
	int data;
	Node next;

	Node(int data){
		this.data = data;
		this.next = null;
	}
}


class MergeLL{
	Node head;
	public void insertData(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}
		
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;

	}

	public void printData(){
		if(head == null){
			System.out.println("list is empty");
			return;
		}
		
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+ " -> ");
			temp = temp.next;
		}
		
		System.out.println();


	}


	public void printData(Node head){
		if(head == null){
			System.out.println("List is empty");
		}

		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+ " -> ");
			temp = temp.next;
		}
		System.out.println();
	}

	public Node mergeList(Node head, Node head1){
		
		Node temp = new Node(0);
		Node n2 = temp;

		if(head == null && head1 != null) return head1;
		if(head != null && head1 == null) return head;
		
		 while(head!= null && head1!= null){
                        if(head.data < head1.data){
                            temp.next = head;
                            head = head.next;
                        }else{
                            temp.next = head1;
                            head1 = head1.next;
                        }
                        
                        temp = temp.next;  
                    }
                         if(head != null)  temp.next = head;
                        if(head1 != null)  temp.next = head1;
                    return n2;
		
					
	}

	public static void main(String[] agrs){
		MergeLL ml = new MergeLL();

		ml.insertData(10);
		ml.insertData(20);
		ml.insertData(30);
		ml.insertData(30);

		ml.printData();
		

		Node head1 = new Node(40);
		head1.next = new Node(50);
		head1.next.next = new Node(60);
		head1.next.next.next = new Node(70);
		ml.printData(head1);
		
		ml.mergeList(ml.head, head1);
		ml.printData(ml.head);
	}
	

}