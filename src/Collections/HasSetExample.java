package Collections;

import java.util.HashSet;

public class HasSetExample {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(5);
        myHashSet.add(5);
        myHashSet.add(10);
        myHashSet.add(15);
        myHashSet.add(20);
        myHashSet.add(25);
        System.out.println(myHashSet);
        System.out.println(myHashSet.contains(25));

    }
    
}
