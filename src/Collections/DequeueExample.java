package Collections;

import java.util.ArrayDeque;

public class DequeueExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.add(10);
        d.add(20);
        d.add(30);
        d.add(40);
        d.addLast(1);
        d.addFirst(0);
        System.out.println(d.getFirst());
        System.out.println(d.getLast());

        
    }
    
}
