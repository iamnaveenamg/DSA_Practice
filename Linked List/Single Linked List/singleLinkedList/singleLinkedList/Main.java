package singleLinkedList;

class Main {
    public static void main(String args[]) {
        LinkedListSingle ll = new LinkedListSingle();
        ll.insertFirst(2);
        ll.insertFirst(4);
        ll.insertFirst(5);
        ll.insertFirst(6);
        ll.insertFirst(7);
        ll.insertLast(10);
        ll.insertLast(11);
        ll.insert(1, 1);
        ll.insert(111, 0);
        ll.display();
    }
}