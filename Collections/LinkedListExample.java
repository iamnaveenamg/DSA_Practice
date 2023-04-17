package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

class LinkedListExample {
    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("naveen");
        ll.add("praveen");
        ll.add("babu");
        ll.add("shiva");
        ll.add("srikanth");
        ll.addFirst("naveenreddy");
        ll.addLast("shetty");
        System.out.println(ll);
        System.out.println(ll.peek());
        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());
        System.out.println(ll.size());
        Iterator<String> i = ll.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("using object");
        List<Book> list = new LinkedList<Book>();
        // Creating Books
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        // Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        // Traversing list

        list.forEach(b -> {
            System.out.println(b.id + " : " + b.name + " : " + b.author + " : " + b.publisher + " : " + b.quantity);
        });
    }
}