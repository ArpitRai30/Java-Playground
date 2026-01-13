package day16;
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of Strings
        TreeSet<String> set = new TreeSet<>();

        // Adding elements
        set.add("Banana");
        set.add("Apple");
        set.add("Orange");
        set.add("Mango");
        set.add("Grapes");
        System.out.println("Initial TreeSet: " + set);

        // Adding duplicate (ignored)
        set.add("Apple");
        System.out.println("After adding duplicate 'Apple': " + set);

        // Access first and last elements
        System.out.println("\nFirst element: " + set.first());
        System.out.println("Last element: " + set.last());

        // Subset, headSet, tailSet
        System.out.println("\nHeadSet (before Mango): " + set.headSet("Mango"));
        System.out.println("TailSet (from Mango): " + set.tailSet("Mango"));
        System.out.println("SubSet (Banana to Orange): " + set.subSet("Banana", "Orange"));

        // higher() and lower()
        System.out.println("\nHigher than 'Banana': " + set.higher("Banana"));
        System.out.println("Lower than 'Mango': " + set.lower("Mango"));

        // Removing elements
        set.remove("Orange");
        System.out.println("\nAfter removing 'Orange': " + set);

        // Poll first and last elements
        System.out.println("\npollFirst(): " + set.pollFirst());
        System.out.println("pollLast(): " + set.pollLast());
        System.out.println("TreeSet after polling: " + set);

        // Check contains and size
        System.out.println("\nContains 'Mango'? " + set.contains("Mango"));
        System.out.println("Size of TreeSet: " + set.size());
        
        // Iterating using for-each
        System.out.println("\nIterating using for-each:");
        for (String item : set) {
            System.out.println(item);
        }
        
        // Iterating in descending order
        System.out.println("\nIterating in descending order:");
        Iterator<String> descItr = set.descendingIterator();
        while (descItr.hasNext()) {
            System.out.println(descItr.next());
        }

        // Clone the TreeSet
        TreeSet<String> clonedSet = (TreeSet<String>) set.clone();
        System.out.println("\nCloned TreeSet: " + clonedSet);

        // Clear TreeSet
        set.clear();
        System.out.println("\nAfter clear(), is TreeSet empty? " + set.isEmpty());
    }
}