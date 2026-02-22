class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertionInLinkList {

    static Node head;

    public static void insertAtStart(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

    }

    public static void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void insertAt(int index, int data) {
        Node newNode = new Node(data);

        if (index == 0) {
            insertAtStart(data);
            return;
        }

        else {

            Node temp = head;
            for (int i = 0; i < index -1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

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
        System.out.println();
        System.out.println("After Insertion: ");

        insertAtStart(23);
        insertAtEnd(11);
        insertAt(3, 67);
        show();

    }

}
