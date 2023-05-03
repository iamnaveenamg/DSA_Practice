package CLL;

class Main {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);
        cll.insert(50);
        cll.delete(20);
        cll.display();
    }
}