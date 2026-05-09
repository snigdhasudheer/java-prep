class Stack {
    int[] arr = new int[5];
    int top = -1;

    // push
    void push(int data) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = data;
    }

    // pop
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Removed: " + arr[top--]);
    }

    // display
    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

public class StackDemo {
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.pop();

        s.display();
    }
}
