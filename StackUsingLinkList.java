// Linked List Node class
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

// Stack class using Linked List
class Stack{
    Node top;
    int count = 0;

    void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        count++;
    }

    int pop(){
        if(top == null){
            System.out.println("Underflow");
            return -1;
        }

        int val = top.data;
        top = top.next;
        count--;
        return val;
    }

    int peek(){
        if(top == null){
            System.out.println("Stack Empty");
            return -1;
        }
        return top.data;
    }

    boolean isEmpty(){
        return top == null;
    }

    int size(){
        return count;
    }

    void show(){
        Node temp = top;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class StackUsingLinkList {
    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(24);
        stack.push(34);
        stack.push(44);
        stack.push(54);
        stack.push(64);

        stack.show();
        System.out.println();

        System.out.println("Size: " + stack.size());

        stack.pop();
        stack.show();
        System.out.println();

        stack.pop();
        stack.show();
        System.out.println();

        System.out.println(stack.isEmpty());

        System.out.println("Top: " + stack.peek());
    }
}
