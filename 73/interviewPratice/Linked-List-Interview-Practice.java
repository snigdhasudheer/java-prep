class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class ReverseLinkedList {

    static Node reverse(Node head) {

        Node prev = null;
        Node curr = head;

        while (curr != null) {

            Node next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }

    static void display(Node head) {

        while (head != null) {

            System.out.print(head.data + " -> ");

            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(10);

        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = reverse(head);

        display(head);
    }
}
