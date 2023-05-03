package SLL;

class SingleLinkedList {
    Node head;
    Node tail;
    int size = 0;

    SingleLinkedList() {
        this.size = 0;
    }

    // insert at begin
    public void InsertAtFront(int Val) {
        Node node = new Node(Val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    // insert at end
    public void InsertAtRear(int val) {
        Node node = new Node(val);
        if (tail == null) {
            InsertAtFront(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    // insert at position
    public void InsertAtPosition(int val, int pos) {
        if (pos == 0) {
            InsertAtFront(val);
            return;
        }
        if (pos == size) {
            InsertAtRear(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    // delete the elemenet at first
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }
    public Node find(int val){
        Node node=head;
        while(node!=null){
            if(node.value==val){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        Node secondLast = temp; // get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }
    public int deletePosition(int pos){
        if(pos==0){
            return deleteFirst();
        }
        if(pos==size-1){
            return deleteLast();
        }
        Node prev=get(pos-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("end");
    }
}