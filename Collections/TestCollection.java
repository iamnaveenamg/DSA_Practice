package Collections;

import java.util.ArrayList;
import java.util.Iterator;

class TestCollection {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Naveen");
        al.add("praveen");
        al.add("shiva");
        al.add("Anand");
        al.add("Manu");
        al.add("madhu");
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + "-->");
        }
    }
}