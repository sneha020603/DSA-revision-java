class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SimpleLinkList {

    static Node head;  

    public static void insertData(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public static void show() {
        Node node = head;

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        // System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        insertData(10);
        insertData(20);
        insertData(30);

        show();
    }
}
