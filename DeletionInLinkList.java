class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeletionInLinkList {

    static Node head;

    public static void deleteAtStart() {
        if (head == null)
        return;
        head = head.next;
    }

    public static void deleteAtEnd() {
        Node temp = head;

        if (head.next == null) {
            head = null;
            return;
        }

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    public static void deleteByKey(int key) {
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public static void deleteByIndex(int index) {

        if (head == null)
            return;

        if (index == 0) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            if (temp.next == null) {
                System.out.println("Index out of bounds");
                return;
            }
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
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
        insertData(40);
        insertData(50);
        insertData(60);
        show();
        System.out.println();


        deleteAtEnd();
        System.out.println("After Deletion: ");
        show();
        System.out.println();

        deleteByIndex(2);
        System.out.println("After Deletion: ");
        show();
        System.out.println();

        deleteByKey(20);
        System.out.println("After Deletion: ");
        show();
        System.out.println();

        deleteAtStart();
        System.out.println("After Deletion: ");
        show();
    }

}
