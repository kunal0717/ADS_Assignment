class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    public static Node search(Node root, int key) {
        if (root == null || root.data == key) {
            return root;
        }

       
       Node leftResult = search(root.left, key);
        if (leftResult != null) {
            return leftResult;
        }

        
        return search(root.right, key);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int key = 5;
        Node result = search(root, key);

        if (result != null) {
            System.out.println("Node " + key + " found in the binary tree.");
        } else {
            System.out.println("Node " + key + " not found in the binary tree.");
        }
    }
}
