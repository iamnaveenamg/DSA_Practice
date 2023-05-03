package DLL;

class MainClass {
    public static void main(String[] args) {
        // DublyLinkedList
        DublyLinkedList dll = new DublyLinkedList();
        dll.InsertFirst(10);
        dll.InsertFirst(20);
        dll.InsertFirst(30);
        dll.InsertFirst(40);
        dll.InsertFirst(50);
        dll.Insertlast(22);
        dll.InsertPostion(100, 20);
        dll.display();
        System.out.println(dll.DeleteAtFirst());
        dll.insert(1000, 4);
        dll.display();
    }

}