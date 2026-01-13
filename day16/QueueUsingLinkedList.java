package day16;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        //creating a queue using linked list
        Queue<String> queue = new LinkedList<>();
        //adding elements to queue (offer/add)
        queue.add("Apple");
        queue.add("Banana");
        queue.offer("Orange");    //safer
        queue.offer("Mango");
        System.out.println("Initial Queue: " + queue);

        //peek at the head of the queue (does not remove) 
        System.out.println("\nHead of the queue (peek()): " + queue.peek());

        //remove and return the head of the queue 
        System.out.println("\nRemoved element (poll()): " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        //remove head explicitly using remove()
        System.out.println("\nRemoved element (remove()): " + queue.remove());
        System.out.println("Queue after remove: " + queue);
        
        //check if element exists
        System.out.println("\nContains 'Mango'? " + queue.contains("Mango"));

        //size of queue 
        System.out.println("Queue size: " + queue.size());

        //iterate using for-each loop
        System.out.println("\nIterating using for-each:");
        for (String item: queue) {
            System.out.println(item);
        }

        //convert to array
        Object[] arr = queue.toArray();
        System.out.println("\nQueue elemets ar array: " + Arrays.toString(arr));

        //clear queue
        queue.clear();
        System.out.println("\nAfter clear(), is queue empty? " + queue.isEmpty());
    }
}
