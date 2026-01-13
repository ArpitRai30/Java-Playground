package day16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        //creating a HashSet of Strings
        Set<String> set = new HashSet<>();
        
        //1. Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Orange");
        set.add("Banana");    //duplicate (ignored)
        System.out.println("Initial HashSet: " + set);

        //contains
        System.out.println("\nHashset contains 'Mango'? " + set.contains("Mango"));

        //size
        System.out.println("\nSize of Hashset is: " + set.size());

        //4. Removing an element
        set.remove("\nOrange");
        System.out.println("After removing Orange: " + set);

        //5. Iterating using for-each
        System.out.println("\nIterating with for-each:");
        for (String fruit: set) {
            System.out.println(fruit);
        }

        //6. Iterating with iterator
        System.out.println("\nIterating with Iterator:");
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        } 

        //7. isEmpty check
        System.out.println("\nIs set empty? " + set.isEmpty());

        //8. AddAll (Union with another set) 
        Set<String> set2 = new HashSet<>();
        set2.add("Kiwi");
        set2.add("Apple");    //duplicate will not be added
        set.addAll(set2);
        System.out.println("\nAfter addAll (union): " + set);

        //9. retainAll (Intersection) 
        Set<String> set3 = new HashSet<>();
        set3.add("Apple");
        set3.add("Mango");
        set.retainAll(set3);
        System.out.println("\nAfter retainAll (Intersection): " + set);

        //10. removerAll (subtraction)
        set.removeAll(set3);
        System.out.println("\nAfter removeAll: " + set);

        //11. clear() method
        set.clear();
        System.out.println("\nAfter clearing set: " + set);
    }
}
