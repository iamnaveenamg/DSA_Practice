package DLL;

class Node {
    int value;
    Node next;
    Node prev;

    Node(int value) {
        this.value = value;
    }

    Node(int value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}