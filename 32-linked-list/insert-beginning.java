

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class InsertBeginning {

    static Node head;

    // insert at beginning
    static void insert(int data) {

        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;
    }

    // display
    static void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        insert(30);
        insert(20);
        insert(10);

        display();
    }
}
