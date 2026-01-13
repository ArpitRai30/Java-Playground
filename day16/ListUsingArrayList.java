package day16;
import java.util.*;

public class ListUsingArrayList {
	public static void main(String[] args) {
		// Creating a List (using ArrayList implementation)
		List<String> list = new ArrayList<>();
		
		// 1. Adding elements
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Mango");
		list.add("Banana"); // duplicate allowed
		System.out.println("Initial List: " + list);
		
		// 2. Adding at specific index
		list.add(2, "Grapes");
		System.out.println("\nAfter adding Grapes at index 2: " + list);
		
		// 3. Getting element
		System.out.println("\nElement at index 3: " + list.get(3));
		
		// 4. Setting element
		list.set(1, "Kiwi");
		System.out.println("\nAfter replacing Banana with Kiwi at index 1: " + list);

		// 5. Removing element (by index and by object)
		list.remove(4); // removes element at index 4
		list.remove("Orange"); // removes "Orange"
		System.out.println("\nAfter removals: " + list);

		// 6. Contains check
		System.out.println("\nList contains 'Apple'? " + list.contains("Apple"));

		// 7. Size of list
		System.out.println("\nSize of list: " + list.size());
		
        // 8. Index methods
		System.out.println("\nIndex of Banana: " + list.indexOf("Banana")); // first
		System.out.println("Last index of Banana: " + list.lastIndexOf("Banana"));

		// 9. Sublist
		List<String> sub = list.subList(1, 3);
		System.out.println("\nSublist from index 1 to 2: " + sub);
		
		// 10. Iterating using for-each
		System.out.println("\nIterating with for-each:");
		for (String fruit : list) {
		    System.out.println(fruit);
		}

		// 11. Iterating using Iterator
		System.out.println("\nIterating with Iterator:");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
		    System.out.println(it.next());
		}
		
		// 12. Check if empty
		System.out.println("\nIs list empty? " + list.isEmpty());

		// 13. Clearing list
		list.clear();
		System.out.println("\nAfter clearing: " + list);
		System.out.println("Is list empty now? " + list.isEmpty());
			
	}
}