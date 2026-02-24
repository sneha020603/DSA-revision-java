class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BST {

    Node root;

    // INSERT
    Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // SEARCH
    boolean search(Node root, int key) {
        if (root == null) return false;

        if (key == root.data) return true;

        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    // INORDER (Sorted Output)
    void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // DELETE
    Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {

            // Case 1: No child
            if (root.left == null && root.right == null)
                return null;

            // Case 2: One child
            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            // Case 3: Two children
            Node successor = findMin(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }

        return root;
    }

    Node findMin(Node root) {
        while (root.left != null)
            root = root.left;
        return root;
    }
}

public class BSTProgram {
    public static void main(String[] args) {

        BST tree = new BST();

        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.println("Search 40: " + tree.search(tree.root, 40));

        tree.root = tree.delete(tree.root, 30);

        System.out.print("After Deletion: ");
        tree.inorder(tree.root);
    }
}
