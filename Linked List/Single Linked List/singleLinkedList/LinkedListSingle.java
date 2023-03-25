class LinkedListSingle {
    Node head;
    Node tail;

    int size = 0;

    LinkedListSingle() {
        this.size = 0;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp.next = temp;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }
    // public int deleteLast() {
    // if (size <= 1) {
    // return deleteFirst();
    // }

    // Node secondLast = get(size - 2);
    // int val = tail.value;
    // tail = secondLast;
    // tail.next = null;
    // size--;
    // return val;
    // }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.val;
        tail = secondLast;
        tail.next = null;
        size--;
        return value;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int value = prev.next.val;
        size--;
        return value;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
}