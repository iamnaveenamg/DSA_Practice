package DLL;

class DublyLinkedList {
    Node head;
    Node tail;
    

    public void InsertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void Insertlast(int val) {
        Node node = new Node(val);
        Node last = head;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void InsertPostion(int val, int after) {
        Node node = new Node(val);
        Node p = find(after);
        if (p == null) {
            System.out.println("Node does not exit");
            return;
        }
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }

    }

    public void insert(int val, int pos) {
        Node node = new Node(val);
        if (pos < 0) {
            return;
        }
        if (head == null) {
            InsertFirst(val);
        }
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        node.prev = temp;
        node.next.prev = node;
        temp.next = node;

    }

    public int DeleteAtFirst() {
        if (head == null) {
            return -1;
        }
        Node temp = head.next;
        head.next = temp.next;
        temp.next.prev = head;
        return temp.prev.value;
    }

    public int deleteAtPosition(int pos) {
        if (pos < 0) {
            return -1;
        }
        if (head == null) {
            return -1;
        }
        if (pos == 0) {

        }
        return -1;
        // return node.value;
    }

    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if (node.value == val) {
                return node;
            }
            node = node.next;
            // return node;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayRev() {

    }

}