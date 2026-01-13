package day16;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //create a Stack of integers
        Stack<Integer> stack = new Stack<>();
        //1. Push elements onto stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Stack after pushes: " + stack);

        //2. Peek top element (without removing)
        System.out.println("Top element using peek(): " + stack.peek());

        //3. Po element (remove top element)
        System.out.println("\nPopped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        //4. Search for element (return 1-based positon from top)
        System.out.println("\nPosition of 20 using search(): " + stack.search(20));
        System.out.println("Position of 50 using search(): " + stack.search(50));

        //5. Check if stack is empty
        System.out.println("\nIs stack empty? " + stack.isEmpty());

        //6. Stack size
        System.out.println("Size of stack: " + stack.size());

        //7. Iterate using for-each
        System.out.println("\nIterating using for-each: ");
        for (Integer num: stack) {
            System.out.println(num);
        }

        //8. Using iterator
        System.out.println("\nIterating using iterator: ");
        Iterator<Integer> it = stack.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //9. Using for loop
        System.out.println("\nIterating using for loop: ");
        for (int i=0; i<stack.size(); i++) {
            System.out.println(stack.get(i));
        }

        //10. Clear stack
        stack.clear();
        System.out.println("\nStack after clear(): " + stack);
        System.out.println("Is stack empty now? " + stack.isEmpty());
    }
}
