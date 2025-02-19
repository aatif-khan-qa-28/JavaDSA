package Collections;

import java.util.ArrayList;

public class ArraylistExample {

    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>(5);

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
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
            System.out.print(",");
        }

    }

}
