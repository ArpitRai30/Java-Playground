
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordAnalysis {
    public static void main(String[] args) {
        String filename = "C:\\Users\\arpit\\Desktop\\JAVA\\assignments\\Example.txt";
        int totalWords = 0;
        Set<String> uniqueWords = new HashSet<>();
        Map<String, Integer> wordFrequency = new HashMap<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        totalWords++;
                        uniqueWords.add(word);
                        wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                    }
                }
            }
            
            System.out.println("Total words: " + totalWords);
            System.out.println("Unique words: " + uniqueWords.size());
            System.out.println("\nWord Frequency:");
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}