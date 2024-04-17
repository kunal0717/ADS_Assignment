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

public class InorderSuccessor {
    static Node successor = null;

    public static Node inorderSuccessor(Node root, Node node) {
        if (node.right != null) {
              return leftMostNode(node.right);
        } else {
            Node parent = findParent(root, node);
            while (parent != null && node == parent.right) {
                node = parent;
                parent = findParent(root, parent);
            }
            return parent;
        }
    }

    public static Node leftMostNode(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public static Node findParent(Node root, Node node) {
        if (root == null || root == node) {
            return null;
        }
        if (root.left == node || root.right == node) {
            return root;
        }
        Node left = findParent(root.left, node);
        Node right = findParent(root.right, node);
        return (left != null) ? left : right;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        
        Node node = root.left;

        Node successor = inorderSuccessor(root, node);

        if (successor != null) {
            System.out.println("Inorder successor of " + node.data + " is " + successor.data);
        } else {
            System.out.println("No inorder successor found for " + node.data);
        }
    }
}