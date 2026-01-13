package sessional3;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1.concat(" World");
        System.out.println("String Example");
        System.out.println("Original String: " + str1);
        System.out.println("New String: " + str2);
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Char at index 1: " + str1.charAt(1));
        System.out.println("Substring (1,4): " + str1.substring(1,4));
        System.out.println("Equals check: " + str1.equals("Hello"));
        System.out.println("Replace: " + str1.replace("Hello", "Hi"));

        System.out.println("\nStringBuffer Example");
        StringBuffer sb = new StringBuffer("Java");
        System.out.println("Original StringBuffer: " + sb);
        sb.append(" Programming");
        System.out.println("After append: " + sb);
        sb.insert(5, "Language ");
        System.out.println("After insert: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
        sb.delete(0, 5);
        System.out.println("After delete: " + sb);
    }
}
