package day16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        //creating a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();
        
        //adding elements 
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");
        System.out.println("Initial list: " + list);

        //add first and last
        list.addFirst("Pineapple");
        list.addLast("Strawberry");
        System.out.println("After addFirst and addLast: " + list);

        //access elements
        System.out.println("\nElement at index 1: " + list.get(1));
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        //update elemets
        list.set(1, "Blueberry");
        System.out.println("\nAfter updating index 1: " + list);

        //remove elements
        list.remove(3);    //by index
        list.remove("Mango");    //by value
        list.removeFirst();
        list.removeLast();
        System.out.println("\nAfter removals: " + list);

        //check if element exists
        System.out.println("\nContains 'Orange'? " + list.contains("Orange"));
        
        //index of element
        System.out.println("Index of 'Orange': " + list.indexOf("Orange"));

        //size of linked list
        System.out.println("\nSize of linked list: " + list.size());

        //Iterating using for-each loop
        System.out.println("\nIterating using for-each:");
        for (String item: list) {
            System.out.println(item);
        }

        //Iterating using iterator
        System.out.println("\nIterating using iterator:");
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //Iterating in descending order
        System.out.println("\nIterating in descending order:");
        Iterator<String> descIt = list.descendingIterator();
        while (descIt.hasNext()) {
            System.out.println(descIt.next());
        }

        //convert to array
        Object[] arr = list.toArray();
        System.out.println("\nLinkedList as array: " + Arrays.toString(arr));

        //clone linked list
        LinkedList<String> clonedList = (LinkedList<String>) list.clone();    //shallow clone
        System.out.println("\nCloned Linked List: " + clonedList);

        //clear linked list
        list.clear();
        System.out.println("\nAfter clear(), is LinkedList empty? " + list.isEmpty());
    }
}
