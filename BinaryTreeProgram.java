class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = right =null;
    }
}

class BinaryTree{
     Node root;

    public void inorder(Node node) {
        if(node == null) return;

        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }

    public void preorder(Node node) {
        if(node == null) return;

        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }

    public void postorder(Node node) {
        if(node == null) return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");   
    }

    public int height(Node node) {
        if(node==null) return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return  Math.max(leftHeight, rightHeight) +1;
    }

    int countNodes(Node node){
        if(node == null) return 0;

        return 1+ countNodes(node.left)+ countNodes(node.right);
    }

}


public class BinaryTreeProgram {
    public static void main(String[] args) {
          BinaryTree tree = new BinaryTree();

        // Creating tree manually
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Preorder: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Postorder: ");
        tree.postorder(tree.root);
        System.out.println();

        System.out.println("Height: " + tree.height(tree.root));
        System.out.println("Total Nodes: " + tree.countNodes(tree.root));
    }
    
}
