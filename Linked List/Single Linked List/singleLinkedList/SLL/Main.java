package SLL;

// 
class Main {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.InsertAtFront(10);
        sll.InsertAtFront(20);
        sll.InsertAtFront(30);
        sll.InsertAtFront(40);
        sll.InsertAtRear(100);
        sll.InsertAtPosition(1000, 2);
        sll.display();
        sll.deleteFirst();
        sll.deleteLast();
        sll.deletePosition(1);
        sll.display();
        System.out.println(sll.find(100000));
        System.out.println(sll.head.value);

    }
}