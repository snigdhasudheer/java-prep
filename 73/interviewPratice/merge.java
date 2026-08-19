static Node merge(Node a, Node b) {

    Node dummy = new Node(0);

    Node current = dummy;

    while (a != null && b != null) {

        if (a.data <= b.data) {

            current.next = a;
            a = a.next;

        } else {

            current.next = b;
            b = b.next;
        }

        current = current.next;
    }

    if (a != null)
        current.next = a;

    else
        current.next = b;

    return dummy.next;
}
