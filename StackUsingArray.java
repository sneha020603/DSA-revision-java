class Stack{

    int top = -1;
    int size;
    int arr[];

    Stack(int size){
        this.size = size;
        arr = new int[size];
    }

    void push(int data){
        if(top == size - 1){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
    }

    int pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek(){
        if(top == -1){
            System.out.println("No Element");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty(){
        return top == -1;
    }

    void show(){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i] + " ");
        }
    }

    int size(){
        return top + 1;
    }
}


public class StackUsingArray {
    public static void main(String[] args) {
        Stack stack = new Stack(7);

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
