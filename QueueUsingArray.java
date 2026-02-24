// Queue using Array

// Queue class using Array
class Queue{
    int front =-1;
    int rear =-1;
    int size;
    int arr[];

    Queue(int size){
        this.size=size;
        arr = new int[size];
    }

    void enQueue(int data){
        if(rear == size -1){
            System.out.println("Queue is overflow");
            return;
        }
        if(front == -1){
            front=0;
        }

        arr[++rear]=data;
    }

    int deQueue(){
        if(front == -1 || front > rear){
            System.out.println("Queue is underfow");
            return -1;
        }

        int val = arr[front++];
        if(front > rear){
            front=rear = -1;
        }
        return val;
    }

    int peek(){
        if(front == -1){
            System.out.println("Queue is empty.");
            return -1;
        }
        return arr[front];
    }

    boolean isEmpty(){
        return front ==-1;
    }

    int getSize(){
        if(front ==-1) return 0;
        return rear-front+1;
    }

    void show(){
        if(front ==-1){
            System.out.println("Queue is empty.");
            return;
        }

        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}


public class QueueUsingArray {
    public static void main(String[] args) {
         Queue q = new Queue(5);

        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);

        q.show();

        System.out.println("Removed: " + q.deQueue());
        q.show();

        System.out.println("Front: " + q.peek());
        System.out.println("Size: " + q.getSize());
        System.out.println("Is Empty: " + q.isEmpty());
        
    }
    
}
