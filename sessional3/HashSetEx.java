package sessional3;

import java.util.*;
public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> students = new HashSet<>();

        students.add("Arpit");
        students.add("Rahul");
        students.add("Sneha");
        students.add("Rahul"); // duplicate (ignored)

        System.out.println("Unique student names:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}

