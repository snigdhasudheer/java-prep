class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {

        // create nodes
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // connect nodes
        first.next = second;
        second.next = third;

        // traverse
        Node temp = first;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
