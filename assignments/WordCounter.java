
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {
    public static int wordCounter(String filename) {
        int count = 0;
        // Use try-with-resources so the reader is closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue; // skip blank lines

                // Split on one or more whitespace characters (spaces, tabs)
                String[] words = line.split("\\s+");
                count += words.length;
            }
        } catch (IOException i) {
            System.err.println("I/O error: " + i.getMessage());
        }
        return count;
    }
    public static void main(String[] args) {
        String file = "C:\\Users\\arpit\\Desktop\\JAVA\\assignments\\Example.txt";
        int word = wordCounter(file);
        System.out.println("Total words in given file is " + word);
    }
}
