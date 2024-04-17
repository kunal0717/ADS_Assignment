import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class ListReversal {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void printList() {
        Node temp = head;
        System.out.println("Doubly Linked List:");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    public static void main(String[] args) {
        ListReversal dll = new ListReversal();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = scanner.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            dll.insert(data);
        }
        scanner.close();

        dll.printList();

        dll.reverse();

        System.out.println("Reversed Doubly Linked List:");
        dll.printList();
    }
}
