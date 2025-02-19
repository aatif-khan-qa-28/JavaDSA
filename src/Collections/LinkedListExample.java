package Collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<Integer>();
        LinkedList<Integer> b = new LinkedList<Integer>();

        // Adding Element in ArrayList
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(0, 5);
        a.add(1, 8);
        b.add(10);
        b.add(12);
        a.addAll(b);
        a.set(1, 565);
        a.addLast(101);
        a.addFirst(100);
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
            System.out.print(" ");
        }

        a.removeFirst();
        a.removeLast();
        System.out.println(" ");
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
            System.out.print(" ");
        }
    }
    
}
