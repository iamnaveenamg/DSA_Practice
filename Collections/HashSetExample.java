package Collections;

import java.util.HashSet;

//mport javax.swing.text.html.HTMLDocument.Iterator;

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

class HashSetExample {
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(70);
        set.add(80);
        System.out.println(set);
        java.util.Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " -->");
        }
        // set.clear();
        System.out.println(set.isEmpty());
        System.out.println(set.remove(20));
        // using object class
        HashSet<Book> set1 = new HashSet<Book>();
        // Creating Books
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        // Adding Books to HashSet
        set1.add(b1);
        set1.add(b2);
        set1.add(b3);
        // Traversing HashSet
        for (Book b : set1) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }

    }
}