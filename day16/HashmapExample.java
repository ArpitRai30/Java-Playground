package day16;
import java.util.*;

public class HashmapExample {
    public static void main(String[] args) {
        // Creating a Map using HashMap
        Map<Integer, String> map = new HashMap<>();
        
        // Adding elements (put)
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.put(4, "Mango");
        System.out.println("Initial Map: " + map);
        
        // Accessing elements (get)
        System.out.println("\nValue for key 2: " + map.get(2));
        
        // Check if key exists
        System.out.println("\nContains key 3? " + map.containsKey(3));
        
        // Check if value exists
        System.out.println("Contains value 'Mango'? " + map.containsValue("Mango"));
        
        // Removing an entry
        map.remove(4);
        System.out.println("\nAfter removing key 4: " + map);
        
        // Replacing a value
        map.replace(2, "Grapes");
        System.out.println("\nAfter replacing value at key 2: " + map);
        
        // Getting all keys
        System.out.println("\nKeys: " + map.keySet());
        
        // Getting all values
        System.out.println("Values: " + map.values());
        
        // Getting all key-value pairs (entrySet)
        System.out.println("Entries: " + map.entrySet());
        
        // Iterating over map using for-each loop
        System.out.println("\nIterating using for-each:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        
        // Checking map size
        System.out.println("\nMap size: " + map.size());
        
        // isEmpty()
        System.out.println("Is map empty? " + map.isEmpty());
        
        // putIfAbsent()
        map.putIfAbsent(5, "Papaya");
        System.out.println("After putIfAbsent: " + map);
        
        // clear()
        map.clear();
        System.out.println("After clear(), map is empty: " + map.isEmpty());
    }
}