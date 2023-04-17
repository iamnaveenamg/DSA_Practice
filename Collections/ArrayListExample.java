package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

class ArrayListExample {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(12);
        list1.add(122);
        list1.add(100);
        list1.add(200);
        list.add(2);
        list.add(3);
        list.add(1, 1);
        System.out.println(list);
        list.ensureCapacity(10); // to define the capacity of list
        // list.addAll(list1); // this method is used to add all the elements form one
        // list to another list
        list.addAll(2, list1);
        // clear is used to remove all elements from list
        // list1.clear();

        // System.out.println(list1);
        System.out.println(list.get(2)); // used to get element at the index

        System.out.println(list.isEmpty()); // used to check list is empty or not . --> return true if list is empty
                                            // else false

        // Iterator<Integer> i = list.iterator();
        // while (i.hasNext()) { // check if iterator has the elements
        // System.out.print(i.next() + " "); // printing the element and move to next
        // }
        // sort of list
        Collections.sort(list1);
        // System.out.println(list1);
        list.set(1, 200);
        System.out.println(list);
        list.forEach(a -> {
            System.out.println(a);
        });
        // Here, element iterates in reverse order
        // ListIterator<Integer> l1 = list.listIterator(list.size());
        // while (l1.hasPrevious()) {
        // System.out.print(l1.previous() + " ");
        // }
        System.out.println("using for eachremaining loop");
        list.remove(2);
        Iterator<Integer> it = list.iterator();
        it.forEachRemaining(a -> {
            System.out.println(a);
        });
    }
}