class Queue {
    int[] arr = new int[5];
    int front = 0;
    int rear = -1;

    // enqueue
    void enqueue(int data) {
        if (rear == arr.length - 1) {
            System.out.println("Queue Full");
            return;
        }

        arr[++rear] = data;
    }

    // dequeue
    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Empty");
            return;
        }

        System.out.println("Removed: " + arr[front++]);
    }

    // display
    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class QueueDemo {
    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.dequeue();

        q.display();
    }
}
